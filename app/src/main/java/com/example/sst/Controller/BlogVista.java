package com.example.sst.Controller;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.R;

public class BlogVista extends AppCompatActivity {

    private TextView txtTitle, txtDescription, txtContent, tvLikeCount;
    private Button btnLike;
    private EditText etComentario;
    private Button btnEnviarComentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_vista);

        txtTitle = findViewById(R.id.txtTitle);
        txtDescription = findViewById(R.id.txtDescription);
        txtContent = findViewById(R.id.txtContent);
        tvLikeCount = findViewById(R.id.tvLikeCount);
        btnLike = findViewById(R.id.btnLike);
        etComentario = findViewById(R.id.etComentario);
        btnEnviarComentario = findViewById(R.id.btnEnviarComentario);


        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String content = intent.getStringExtra("content");


        txtTitle.setText(title);
        txtDescription.setText(description);
        txtContent.setText(content);


        tvLikeCount.setText("0 Likes");

        btnLike.setOnClickListener(v -> {
            int currentLikes = Integer.parseInt(tvLikeCount.getText().toString().split(" ")[0]);
            currentLikes++;
            tvLikeCount.setText(currentLikes + " Likes");
        });


        btnEnviarComentario.setOnClickListener(v -> {
            String comentario = etComentario.getText().toString();
            etComentario.setText("");
        });
    }
}
