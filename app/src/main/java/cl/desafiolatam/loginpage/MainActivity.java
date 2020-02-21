package cl.desafiolatam.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

public ImageView imageView;

private Button MiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        Picasso.get (). load ("http://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png") .into (imageView);

    Button btntoast = (Button)findViewById(R.id.button);
    btntoast.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Usuario ingreso con exito", Toast.LENGTH_SHORT).show();
        }
    });


    }


}

