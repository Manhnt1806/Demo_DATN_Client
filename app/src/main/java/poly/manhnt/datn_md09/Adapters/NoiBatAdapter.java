package poly.manhnt.datn_md09.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import poly.manhnt.datn_md09.R;


public class NoiBatAdapter extends RecyclerView.Adapter<NoiBatAdapter.ViewHolder> {
    Context context;
    List<String> stringList;
    public NoiBatAdapter(Context context, List<String> stringList){
        this.context = context;
        this.stringList = stringList;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtTieuDeNoiBat);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_recycler_noi_bat, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.textView.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }
}
