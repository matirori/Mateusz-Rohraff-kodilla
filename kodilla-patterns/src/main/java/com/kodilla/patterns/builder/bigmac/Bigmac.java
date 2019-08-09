package com.kodilla.patterns.builder.bigmac;


import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<Ingredient> ingredients;

    public static class BigmacBuilder {
        private  String bun;
        private  int burgers;
        private  String sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder Bun(String bun) {
            if (bun.equals("sesame bun") || bun.equals("normal bun")) {
                this.bun = bun;
            }else {
                throw new IllegalStateException("You can choose beetwen sesame bun or normal bun");
            }
            return this;
        }

        public BigmacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder Souce(String souce) {
            this.sauce = souce;
            return this;
        }

        public BigmacBuilder Ingredients(String ingredient) {
            this.ingredients.add(IngredientsFactory.makeIngredient(ingredient));
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
