package fulcrumwebappapp.app;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by erikh on 2017-12-10.
 */

class RequestTask extends AsyncTask<String, String, String> {

    @Override
// username, password, message, mobile
    protected String doInBackground(String... url) {

        try {
            String line;
            String out = "";
            URL site1 = new URL("http://kapaspeak.tk:1013");
            InputStream is = site1.openStream();
            BufferedReader dis = new BufferedReader(new InputStreamReader(is));

            while ((line = dis.readLine()) != null) {
                out += line;
            }

            return out;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        // do something with result
    }
}

