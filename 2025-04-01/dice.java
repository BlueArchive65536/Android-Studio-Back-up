RadioButton radioButton;
    RadioButton radioButton1;
    Button button;
    ImageView imageView4;
    ImageView imageView5;

    int dice;
    int dice2;
    boolean doubles;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        button = (Button) findViewById(R.id.button);
        imageView4 = findViewById(R.id.ImageView4);
        imageView5 = findViewById(R.id.ImageView5);

        radioButton.setChecked(false);
        radioButton1.setChecked(true);
    }


    public void dice_1(View v) {
        imageView5.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.VISIBLE);
        doubles = false;
    }

    public void dice_2(View v)
    {
        imageView5.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);
        doubles = true;
    }

    public void dice(View v)
    {
        dice = (int)(Math.random()*6)+1;
        imageView4.setImageResource(R.drawable.dice1+dice-1);
        dice2 = (int)(Math.random()*6)+1;
        imageView5.setImageResource(R.drawable.dice1+dice2-1);
        if(dice == dice2 && doubles){
            Toast.makeText(this, "          <<더블>>\n주사위를 한번 더 던지시오.", Toast.LENGTH_SHORT).show();
        }
    }
