package jp.ac.asojuku.st.familyapps;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Garudo24 on 2016/11/02.
 */
final class FortuneViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public FortuneViewHolder(View v){
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }
}
