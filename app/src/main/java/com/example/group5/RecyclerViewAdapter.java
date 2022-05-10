package com.example.group5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Filterable {

    /**上方的arrayList為RecyclerView所綁定的ArrayList*/
    ArrayList<String> arrayList;
    /**儲存最原先ArrayList的狀態(也就是充當回複RecyclerView最原先狀態的陣列)*/
    ArrayList<String> arrayListFilter;

    public RecyclerViewAdapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
        arrayListFilter = new ArrayList<>();
        /**這裡把初始陣列複製進去了*/
        arrayListFilter.addAll(arrayList);

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(android.R.id.text1);
            /**點擊事件*/
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(itemView.getContext(), arrayList.get(getAdapterPosition())
                    , Toast.LENGTH_SHORT).show();
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvItem.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public Filter getFilter() {
        return mFilter;
    }
    /**使用Filter濾除方法*/
    Filter mFilter = new Filter() {
        /**此處為正在濾除字串時所做的事*/
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            /**先將完整陣列複製過去*/
            ArrayList<String> filteredList = new ArrayList<>();
            /**如果沒有輸入，則將原本的陣列帶入*/
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(arrayListFilter);
            } else {
                /**如果有輸入，則照順序濾除相關字串
                 * 如果你有更好的搜尋演算法，就是寫在這邊*/
                for (String movie: arrayListFilter) {
                    if (movie.toLowerCase().contains(constraint.toString().toLowerCase())) {
                        filteredList.add(movie);
                    }
                }
            }
            /**回傳濾除結果*/
            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }
        /**將濾除結果推給原先RecyclerView綁定的陣列，並通知RecyclerView刷新*/
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            arrayList.clear();
            arrayList.addAll((Collection<? extends  String>) results.values);
            notifyDataSetChanged();
        }
    };
}