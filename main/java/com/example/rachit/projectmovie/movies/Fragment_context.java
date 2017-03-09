package com.example.rachit.projectmovie.movies;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.rachit.projectmovie.BuildConfig;
import com.example.rachit.projectmovie.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class Fragment_context extends Fragment {
    public ImageListAdapter imagelistadapter;
    public GridView gridView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FetchMovie fetchmovie=new FetchMovie();
        fetchmovie.execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_context, container, false);
        gridView= (GridView) rootView.findViewById(R.id.gridView);
        return rootView;

    }


    public class FetchMovie extends AsyncTask<String[], Void, String[]> {

        private final String LOG_TAG = FetchMovie.class.getSimpleName();

        private String[] getmovieDataFromJson(String moviesJsonStr)
                throws JSONException {

            JSONObject movieJson = new JSONObject(moviesJsonStr);
            JSONArray movieArray = movieJson.getJSONArray("results");
            String[] resultStrs = new String[movieArray.length()];


            for (int i = 0; i < movieArray.length(); i++) {

                JSONObject movieObject = movieArray.getJSONObject(i);
                String movieImg = movieObject.getString("poster_path");
                resultStrs[i] = "http://image.tmdb.org/t/p/w185/" + movieImg;

            }
            Log.v(LOG_TAG, Arrays.toString(resultStrs));
            return resultStrs;
        }


        @Override
        protected String[] doInBackground(String[]... params) {
            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;

            // Will contain the raw JSON response as a string.
            String MoviesJsonStr = null;
            try {
                // Construct the URL for the themoviesdb query
                final String MOVIES_BASE_URL = "http://api.themoviedb.org/3/movie/now_playing?";
                final String APPID_PARAM = "api_key";
                Uri builtUri = Uri.parse(MOVIES_BASE_URL).buildUpon()
                        .appendQueryParameter(APPID_PARAM, BuildConfig.MOVIES_THIS_WEAK_API_KEY)
                        .appendQueryParameter("","&append_to_response=upcoming,top_rated")
                        .build();
                URL url = new URL(builtUri.toString());


                // Create the request to moviesdb, and open the connection
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuilder buffer = new StringBuilder();
                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    // Since it's JSON, adding a newline isn't necessary (it won't affect parsing)
                    // But it does make debugging a *lot* easier if you print out the completed
                    // buffer for debugging.
                    buffer.append(line).append("\n");
                }
                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                      MoviesJsonStr = buffer.toString();

            } catch (IOException e) {
                Log.e(LOG_TAG, "Error ", e);

            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();

                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (final IOException e) {
                        Log.e(LOG_TAG, "Error closing stream", e);
                    }

                }
                try {
                    return getmovieDataFromJson(MoviesJsonStr);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String[] result) {
            super.onPostExecute(result);

            imagelistadapter = new ImageListAdapter(getActivity(),result);
            gridView.setAdapter(imagelistadapter);


        }
    }
}
