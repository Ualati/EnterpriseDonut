package uk.ac.tees.q5113445live.enterpriseproject2;

/**
 * Created by q5113445 on 27/02/18.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.tasks.Task;

import java.util.List;
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List<Delivery> task;
    protected Context context;
    public RecyclerViewAdapter(Context context, List<Delivery> task) {
        this.task = task;
        this.context = context;
    }
    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolders viewHolder = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        viewHolder = new RecyclerViewHolders(layoutView, task);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position)
    {
        holder.delivery.setText(task.get(position).getDeliver());
    }
    @Override
    public int getItemCount() {
        return this.task.size();
    }
}
