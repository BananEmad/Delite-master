package com.fci.delite;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class typelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typelist);

        ListView listViewjava =(ListView)findViewById(R.id.listViewXML);


        foods Soup =new foods("accoun","Soup","next");
        foods Pasta =new foods("accoun","Pasta","next");
        foods Pizza =new foods("accoun","Pizza","next");
        foods Beef =new foods("accoun","Beef","next");
        foods Chicken =new foods("accoun","Chicken","next");
        foods Seafood =new foods("accoun","Seafood","next");
        foods Salat =new foods("accoun","Salat","next");
        foods Side_Dishes =new foods("accoun","Side Dishes","next");
        foods Desert =new foods("accoun","Desert","next");
        foods Cold_Drink =new foods("accoun","old Drink","next");
        foods Hot_Drink =new foods("accoun","Hot Drink","next");

        foods [] foodlist={Soup,Pasta,Pizza,Beef,Chicken,Seafood,Salat,Side_Dishes,Desert,Cold_Drink,Hot_Drink} ;

        int XMLFile= R.layout.food_row;

        foodsAdapter adapter=new foodsAdapter(typelist.this,XMLFile,foodlist);

        listViewjava.setAdapter(adapter);

       // ListView listViewjava =(ListView)findViewById(R.id.listViewXML);
       // String []food ={"Soup","Pasta","Pizza","Beef","Chicken","Seafood","Salat","Side Dishes","Desert","Cold Drink","Hot Drink"};

//        int XMLFile= R.layout.support_simple_spinner_dropdown_item;

//        ArrayAdapter adapter =new ArrayAdapter(typelist.this,XMLFile,food);

  //      listViewjava.setAdapter(adapter);




    }
}
