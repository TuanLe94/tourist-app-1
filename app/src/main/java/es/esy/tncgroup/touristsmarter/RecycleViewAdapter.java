package es.esy.tncgroup.touristsmarter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter <RecycleViewAdapter.TouristHolder> {
    List<String> touristite;
    public RecycleViewAdapter(List<String> touristite){
        this.touristite = touristite;
    }
    @NonNull
    @Override
    public TouristHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        TextView y = (TextView) inflater.inflate(android.R.layout.simple_list_item_1,parent,false);
        TouristHolder holder = new TouristHolder(y);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TouristHolder holder, int position) {
        String site = touristite.get(position);
        holder.bindView(site);

    }


    @Override
    public int getItemCount() {
        return touristite.size();
    }
    public static class TouristHolder extends RecyclerView.ViewHolder{
        private TextView view;
        public TouristHolder(View itemView){

            super(itemView);
            this.view= (TextView) itemView;
        }
        public   void bindView(String touristItems){
            view.setText(touristItems);
        }
    }

}

