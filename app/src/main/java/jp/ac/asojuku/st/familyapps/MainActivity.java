package jp.ac.asojuku.st.familyapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);

        ArrayList<FortuneData> fortune = new ArrayList<FortuneData>();
        for(int i = 0;i < Fortune_TellData.commentArray.length; i++){
            fortune.add(new FortuneData(
                    Fortune_TellData.commentArray[i],
                    Fortune_TellData.pointArray[i],
                    Fortune_TellData.colorArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new FortuneAdapter(fortune);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(fortune.size() - 1);

    }
}
