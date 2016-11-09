package com.example.ayankapoor.todolist3;



        import android.support.v7.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.content.SharedPreferences;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.content.Context;

        import android.support.v7.widget.Toolbar;
        import android.util.Log;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Button;

        import android.os.Bundle;

        import java.util.ArrayList;

public class MyActivity extends AppCompatActivity{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    static ArrayList<object> myDataset=new ArrayList<object>();

    SharedPreferences sharedpreferences;

    //String abc = "hello";
    String tit;
    String des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


                Intent intent = getIntent();
                tit = intent.getStringExtra("title");
                des = intent.getStringExtra("description");
                object o1 = new object(tit, des, 1);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

                myDataset.add(o1);

                sharedpreferences = getPreferences(Context.MODE_PRIVATE);
                // use this setting to improve performance if you know that changes
                // in content do not change the layout size of the RecyclerView
                //  mRecyclerView.setHasFixedSize(true);
                String abc = "abc";
                // myDataset.add(abc);
                // use a linear layout manager
                mLayoutManager = new LinearLayoutManager(this);
                mRecyclerView.setLayoutManager(mLayoutManager);

                // specify an adapter (see also next example)
                mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

                mAdapter = new MyAdapter(myDataset);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                mRecyclerView.setLayoutManager(mLayoutManager);
                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                mRecyclerView.setAdapter(mAdapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(getApplicationContext(),addit.class);
            startActivityForResult(intent,1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
