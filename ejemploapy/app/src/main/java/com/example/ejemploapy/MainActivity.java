package com.example.ejemploapy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String TAG=MainActivity.class.getName();
    Button crear;
    Button buscar;
    Button main;

    RequestQueue mRequestQueve;
    StringRequest mStringRequest;

    String url = "http://javierblanco.com.ar/androiduser/buscar.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crear= findViewById(R.id.crear);
        buscar=findViewById(R.id.buscar);
        main=findViewById(R.id.main);



        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAndRequestResponse();
            }
        });

        crear = (Button) findViewById((R.id.crear));
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAndRequestResponse();
            }
        });

    }

    private void sendAndRequestResponse() {
        mRequestQueve= Volley.newRequestQueue(this);
        Toast.makeText(this, "manda", Toast.LENGTH_SHORT).show();
        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject.obj = new JSONObject(response);
                    String email = obj.getString("email");
                    edName.setText(email);
                    Log.e("EMAIL","seccess! email:" + email);
                    Toast.makeText(getApplicationContext(), "response" + email,Toast.LENGTH_LONG).show();
                } catch (JSONException e){
                    e.printStackTrace();
                }
                Log.e("HttpClient", "success! response: " + response.toString());
               // Toast.makeText(getApplicationContext(), "response" + response.toString(), Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG,"Error" + error.toString());
            }
        } )

        {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id","25");
                return params;
            }
            @Override
            public Map<String,String> getHeaders() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("Content-Type", "application/x-www-form-urlencoded");
                return params;
            }
        };

        mRequestQueve.add(mStringRequest);
    }
            }


