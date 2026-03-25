public void onClick(View view) {
    ImageView imageView = findViewById(R.id.imageView4);

    if(imageset){
        imageView.setVisibility(View.INVISIBLE);
        imageset = false;
    } else {
        imageView.setVisibility(View.VISIBLE);
        imageset = true;
    }

    Toast.makeText(this, "배경화면을 전환합니다", Toast.LENGTH_SHORT).show();
}

public void Clicked(View view) {
    Intent intent = new Intent(
        Intent.ACTION_VIEW,
        Uri.parse("https://terms.naver.com/entry.naver?docId=523112&cid=46639&categoryId=46639")
    );
    startActivity(intent);
}
