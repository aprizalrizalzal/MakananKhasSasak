package me.aprizal.makanankhassasak.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import me.aprizal.makanankhassasak.R;
import me.aprizal.makanankhassasak.home.detail.DetailActivity;
import me.aprizal.makanankhassasak.model.ModelMenu;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ListViewHolder> {
    private final ArrayList<ModelMenu>menuArrayList;

    public ListMenuAdapter(ArrayList<ModelMenu> menuList) {
        this.menuArrayList = menuList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ListMenuAdapter.ListViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_menu,parent,false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull ListMenuAdapter.ListViewHolder holder, int position) {
        ModelMenu modelMenu = menuArrayList.get(position);
        holder.bind(modelMenu);
    }

    @Override
    public int getItemCount() {
        return menuArrayList.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMenu;
        TextView tvMenu;
        TextView tvDetail;
        public ListViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            imgMenu=itemView.findViewById(R.id.img_menu);
            tvMenu=itemView.findViewById(R.id.tv_item_name);
            tvDetail=itemView.findViewById(R.id.tv_item_detail);
        }

        public void bind(ModelMenu modelMenu) {
            Glide.with(itemView.getContext()).load(modelMenu.getImageMenu()).apply(new RequestOptions().override(255, 255)).into(imgMenu);
            tvMenu.setText(modelMenu.getMenuEat());
            tvDetail.setText(modelMenu.getDetailMenu());

            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(),DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_IMAGE_MENU,modelMenu.getImageMenu());
                intent.putExtra(DetailActivity.EXTRA_MENU_EAT,modelMenu.getMenuEat());
                intent.putExtra(DetailActivity.EXTRA_DETAIL_MENU,modelMenu.getDetailMenu());
                intent.putExtra(DetailActivity.EXTRA_DETAIL_LOCATION,modelMenu.getDetailLocation());
                itemView.getContext().startActivity(intent);
            });
        }
    }
}
