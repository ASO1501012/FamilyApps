package jp.ac.asojuku.st.familyapps;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Garudo24 on 2016/10/28.
 */
public class FortuneAdapter extends RecyclerView.Adapter<FortuneViewHolder>{
    private ArrayList<FortuneData> rouletteDataSet;

    public FortuneAdapter(ArrayList<FortuneData> roulette){

        this.rouletteDataSet = roulette;
    }

    @Override
    public FortuneViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);

        return new FortuneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FortuneViewHolder holder, final int listPosition) {

        holder.textViewNumber.setText(rouletteDataSet.get(listPosition).getNumber()+"本");
        holder.textViewComment.setText(rouletteDataSet.get(listPosition).getComment());
        holder.base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(),"おまけ" + rouletteDataSet.get(listPosition).getAddition() + "本" , Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return rouletteDataSet.size();
    }
}
