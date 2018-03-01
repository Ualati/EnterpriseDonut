package uk.ac.tees.q5113445live.enterpriseproject2;

/**
 * Created by q5113445 on 27/02/18.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.util.List;
public class RecyclerViewHolders extends RecyclerView.ViewHolder{
    private static final String TAG = RecyclerViewHolders.class.getSimpleName();

    public TextView delivery;
    private List<Delivery> taskObject;
    public RecyclerViewHolders(final View itemView, final List<Delivery> taskObject) 
    {
        super(itemView);
        this.taskObject = taskObject;
        delivery = (TextView)itemView.findViewById(R.id.content);

    }
}
