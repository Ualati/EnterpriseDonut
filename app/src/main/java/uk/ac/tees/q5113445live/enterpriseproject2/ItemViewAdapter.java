package uk.ac.tees.q5113445live.enterpriseproject2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import uk.ac.tees.q5113445live.enterpriseproject2.ItemFragment.OnListFragmentInteractionListener;
import uk.ac.tees.q5113445live.enterpriseproject2.dummy.DummyContent.DummyItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class ItemViewAdapter extends RecyclerView.Adapter<ItemViewAdapter.ItemViewHolder>
{

    private ArrayList<Delivery> entries;

    public ItemViewAdapter(ArrayList<Delivery> entries){
        this.entries = entries;
    }

    public ItemViewAdapter(List<Delivery> items, OnListFragmentInteractionListener mListener)
    {
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, null);

        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemViewAdapter.ItemViewHolder holder, int position)
    {

        holder.weight.setText(entries.get(position).getWeight());
        holder.size.setText(entries.get(position).getSize());
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                // Do something
            }
        });
    }

    @Override
    public int getItemCount() {
        return entries.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder
    {
        TextView weight, size;

        public ItemViewHolder(View itemView)
        {
            super(itemView);
            weight =    itemView.findViewById(R.id.content);
            size =      itemView.findViewById(R.id.id);
        }
    }

}
