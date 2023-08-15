package tranhph26979.fpoly.nguyenhoangtra_ph26979_thi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity2 extends AppCompatActivity {
    String strKQ="";
    TextView tvKQ;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvKQ=findViewById(R.id.textView);
        RequestQueue queue= Volley.newRequestQueue(context);
        String url="https://jsonplaceholder.typicode.com/albums";
        JsonArrayRequest request=new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        strKQ="";
                        for(int i=0;i<response.length();i++)
                        {
                            try {
                                JSONObject person=response.getJSONObject(i);
                                String userId=person.getString("userId");
                                String id=person.getString("id");
                                String title=person.getString("title");
                                strKQ += "userId: "+userId+"\n";
                                strKQ += "id: "+id+"\n";
                                strKQ += "title: "+title+"\n\n";
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        tvKQ.setText(strKQ);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        tvKQ.setText(error.getMessage());
                    }
                });
        queue.add(request);
    }
}