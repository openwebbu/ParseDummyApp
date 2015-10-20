package sean.noteapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Sean on 10/19/15.
 */
public class NoteAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "EWm45pIZTDbnjwhUIl09dUM0aM9lygXaicaiHmvv", "fJSWol5CBlMNNw2pCWOjSKnYdx4jsi94R82lhDt7");


    }
}
