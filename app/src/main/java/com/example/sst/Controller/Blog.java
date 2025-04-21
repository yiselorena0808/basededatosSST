package com.example.sst.Controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.R;

public class Blog extends AppCompatActivity {

    private EditText edtTitle, edtDescription, edtContent;
    private Button btnAttachImage, btnSavePost;
    private ImageView imgPreview;

    private static final int IMAGE_PICK_REQUEST = 1;
    private Uri imageUri;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_epp);

        edtTitle = findViewById(R.id.edtTitle);
        edtDescription = findViewById(R.id.edtDescription);
        edtContent = findViewById(R.id.edtContent);
        btnAttachImage = findViewById(R.id.btnAttachImage);
        btnSavePost = findViewById(R.id.btnSavePost);
        imgPreview = findViewById(R.id.imgPreview);

        btnAttachImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, IMAGE_PICK_REQUEST);
            }
        });

        btnSavePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edtTitle.getText().toString().trim();
                String description = edtDescription.getText().toString().trim();
                String content = edtContent.getText().toString().trim();
                if (title.isEmpty() || description.isEmpty() || content.isEmpty()) {
                    Toast.makeText(Blog.this, "Todos los campos son requeridos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Blog.this, "Post guardado con éxito", Toast.LENGTH_SHORT).show();

                    edtTitle.setText("");
                    edtDescription.setText("");
                    edtContent.setText("");
                    imgPreview.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == IMAGE_PICK_REQUEST && resultCode == RESULT_OK && data != null) {
            imageUri = data.getData();
            imgPreview.setImageURI(imageUri);
            imgPreview.setVisibility(View.VISIBLE);
        }
    }
}
