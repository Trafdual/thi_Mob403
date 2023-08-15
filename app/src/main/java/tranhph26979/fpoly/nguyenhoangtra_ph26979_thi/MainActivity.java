package tranhph26979.fpoly.nguyenhoangtra_ph26979_thi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView tvkq;
    Button bai21, bai22, bai23,bai1;
    Context context = this;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvkq = findViewById(R.id.textView);
        bai21 = findViewById(R.id.bai21);
        bai22 = findViewById(R.id.bai22);
        bai23 = findViewById(R.id.bai23);
        bai1=findViewById(R.id.bai1);
        bai21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBai21();
            }
        });
        bai22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBai22();
            }
        });
        bai23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBai23();
            }
        });
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
    }

    String strKQ = "";
    private void setBai21() {
        RequestQueue queue= Volley.newRequestQueue(context);

        String url="https://trafdual.000webhostapp.com/Bai21Thi.php";
        StringRequest request=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        tvkq.setText(response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                tvkq.setText(error.getMessage());
            }
        });
        queue.add(request);
        };
    private void setBai22() {
        RequestQueue queue= Volley.newRequestQueue(context);

        String url="https://trafdual.000webhostapp.com/Bai22Thi.php";
        StringRequest request=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        tvkq.setText(response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                tvkq.setText(error.getMessage());
            }
        });
        queue.add(request);
    };


    private void setBai23() {
        RequestQueue queue= Volley.newRequestQueue(context);

        String url="https://trafdual.000webhostapp.com/Bai23Thi.php";
        StringRequest request=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        tvkq.setText(response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                tvkq.setText(error.getMessage());
            }
        });
        queue.add(request);
    }
}