package sg.edu.rp.c346.democustomlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    ArrayAdapter aa;
    ArrayList<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFood = (ListView) findViewById(R.id.lvFood);
        // Create a few food objects in Food array
        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee", false));
        food.add(new Food("Rocky Choc", true));
        food.add(new Food("Kid Cat Choc", true));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new FoodAdapter(this, R.layout.row, food);
        lvFood.setAdapter(aa);

        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Food selectedFood = food.get(position);

                Toast.makeText(MainActivity.this, selectedFood.getName()
                                + " Star: " + selectedFood.isStar(),
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, intent.class);
                intent.putExtra("name",selectedFood.getName() );
                intent.putExtra("bool",String.valueOf(selectedFood.isStar()));
               startActivity(intent);

            }
        });

    }
}
