ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
    }

    public void onclick(View view)
    {
        imageView3.setImageResource(0);
        imageView4.setImageResource(R.drawable.image01);
    }

    public void onclick2(View view)
    {
        imageView3.setImageResource(R.drawable.image01);
        imageView4.setImageResource(0);
    }
