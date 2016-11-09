package com.example.ayankapoor.todolist3;



        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.ArrayList;
/**
 * Created by Ayankapoor on 09/11/16.
 */
public class object {

    public String title;
    public String details;
    public int done;

    public object(String title, String details, int done) {
        this.title = title;
        this.details = details;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public int isDone() {
        return done;
    }

    public void setStatus(int done) {
        this.done = done;
    }
}


