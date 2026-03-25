ImageView imageView;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imageView = findViewById(R.id.imageView);
}

public void onInput(View view) {

    int rands = (int) (
        Math.random() *
        Integer.parseInt(
            ((android.widget.EditText) findViewById(R.id.editTextText4))
                .getText().toString()
        ) + 1
    );

    ((android.widget.TextView) findViewById(R.id.outputText))
        .setText(String.valueOf(rands));

    imageView.setImageResource(
        R.drawable.o91 + (int)(Math.random() * 3)
    );

    Toast.makeText(this, "배경화면을 전환합니다.", Toast.LENGTH_SHORT).show();
}
