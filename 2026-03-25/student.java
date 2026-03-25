ImageView[] imageView = new ImageView[3];

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    for(int i = 0; i < 3; i++){
        imageView[i] = findViewById(R.id.imageView4 + i);
    }
}

public void onInput(View view) {
    ((android.widget.TextView) findViewById(R.id.outputText))
        .setText(String.valueOf(
            (int) (Math.random() *
            Integer.parseInt(
                ((android.widget.EditText) findViewById(R.id.editTextText4))
                    .getText().toString()
            ) + 1)
        ));

    Toast.makeText(this, "배경화면을 전환합니다.", Toast.LENGTH_SHORT).show();

    images((int)(Math.random() * 3));
}

public void images(int j) {
    for(int i = 0; i < 3; i++) {
        if(i == j)
            imageView[i].setVisibility(View.VISIBLE);
        else
            imageView[i].setVisibility(View.INVISIBLE);
    }
}
