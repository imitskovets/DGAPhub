package ivan.mitskovets.dormitory.system.dgaphub;

import android.os.AsyncTask;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ReportSender extends AsyncTask<String, Void, String> {

    public String requestBody="";
    protected void onPreExecute(){
        super.onPreExecute();
    }
    @Override
    protected String doInBackground(String... urls) {
        String output = null;
        for (String url : urls) {
            output = getOutputFromUrl(url);
        }
        return output;
    }

    private String getOutputFromUrl(String url) {
        String responseCode = "empty_form_Serv_Con_getOutputFromUrl";
        try {
            responseCode = getHttpConnection(url);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return responseCode;
    }

    private String getHttpConnection(String urlString) throws IOException {
        String responseCode = "default_responseCode(something seams wrong)";
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
            httpConnection.setRequestProperty("Accept", "*/*");
            httpConnection.setDoOutput(true);
            httpConnection.connect();
            OutputStreamWriter writer = new OutputStreamWriter(httpConnection.getOutputStream());
            String urlParameters = requestBody;
            writer.write(urlParameters);
            writer.flush();
            writer.close();
            responseCode = String.valueOf(httpConnection.getResponseCode());
            Log.v("CatalogClient", "Response code:" + responseCode);
            httpConnection.disconnect();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return responseCode;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        //AsyncTask END
    }
}