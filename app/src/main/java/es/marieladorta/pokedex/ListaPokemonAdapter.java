package es.marieladorta.pokedex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.util.ArrayList;

import es.marieladorta.pokedex.models.Pokemon;

public class ListaPokemonAdapter extends RecyclerView.Adapter<ListaPokemonAdapter.ViewHolder> {

    private Context context;

    private ArrayList<Pokemon> pokeList;

    public ListaPokemonAdapter(Context context) {
        this.context = context;
        pokeList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pokemon, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Pokemon pokemon = pokeList.get(i);
        viewHolder.nombrePokemon.setText(pokemon.getName());

        //Imágenes con Glide
        Glide.with(context).load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+ pokemon.getNumber() +".png")
        .centerCrop()
        .transition(new DrawableTransitionOptions()
                .crossFade())
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .into(viewHolder.fotoPokemon);
    }

    @Override
    public int getItemCount() {
        return pokeList.size();
    }

    public void addListaPokemon(ArrayList<Pokemon> listaPokemon) {
        pokeList.addAll(listaPokemon);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView fotoPokemon;
        private TextView nombrePokemon;

        public ViewHolder(View itemView){
            super(itemView);

            fotoPokemon = itemView.findViewById(R.id.fotoPokemon);
            nombrePokemon = itemView.findViewById(R.id.nombrePokemon);
        }
    }
}
