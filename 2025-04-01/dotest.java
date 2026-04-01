CheckBox checkBox;
    TextView textView;
    ScrollView scrollView;
    RadioButton[] RadioButton = new RadioButton[4];
    TextView textView8;
    int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        textView = findViewById(R.id.textView3);
        scrollView = findViewById(R.id.ScrollView);
        RadioButton[0] = findViewById(R.id.radioButton18);
        RadioButton[1] = findViewById(R.id.radioButton20);
        RadioButton[2] = findViewById(R.id.radioButton27);
        RadioButton[3] = findViewById(R.id.radioButton30);
        textView8 = findViewById(R.id.textView8);


    }


    public void Aclass(View v) {
        if (checkBox.isChecked()) {
            textView.setVisibility(View.VISIBLE);
            scrollView.setVisibility(View.INVISIBLE);
            textView.setText("A");
        } else {
            textView.setVisibility(View.INVISIBLE);
            scrollView.setVisibility(View.VISIBLE);
        }
    }

    public void BCDEclass(View v)
    {
        textView8.setVisibility(View.VISIBLE);
        for(int i=0; i<4; i++)
        {
            if((!RadioButton[i].isChecked())) {
                j++;
            }
        }
        textView8.setText((char)(65+j)+"");
        j = 0;
    }
