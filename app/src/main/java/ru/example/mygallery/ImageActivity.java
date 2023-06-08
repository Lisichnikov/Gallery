package ru.example.mygallery;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import java.io.File;

public class ImageActivity extends AppCompatActivity {

    private String imgPath;
    private ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imgPath = getIntent().getStringExtra("imgPath");
        imageView = findViewById(R.id.idImage);

        File imgFile = new File(imgPath);

//        if (imgFile.exists()) {
//            Picasso.get().load(imgFile).placeholder(R.drawable.ic_launcher_background).into(imageView);
//        }
    }
}