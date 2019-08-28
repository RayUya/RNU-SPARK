package com.example.itproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class FoodMenuPage extends AppCompatActivity {

    TextView main;

    CheckBox wrts, wrcs, jr, esy, spag, pse, bp, abacha, salad, fp, yff, cr, esaucey,
            egusi, veg, ogbono, okro, oha, ofe, banga, stew, moi_moi, chicken, beef,
            fish, egg, froll, donut, chin, pie, puff, bread, biscuit,delivery;

    Button order;

    int wrts_cost ,wrcs_cost, jr_cost, esy_cost, spag_cost, pse_cost, bp_cost, abacha_cost,
            salad_cost, fp_cost, yff_cost, cr_cost, esaucey_cost, egusi_cost, veg_cost, ogbono_cost,
            okro_cost, oha_cost, ofe_cost, banga_cost, stew_cost, moi_moi_cost, chicken_cost, beef_cost,
            fried_fish_cost, bioled_egg_cost, froll_cost, donut_cost, chin_cost, pie_cost, puff_cost, bread_cost, bicuit_cost, delivery_cost = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu_page);

        // total cost
        main = findViewById(R.id.total);
        // place order button
        order = findViewById(R.id.place_order_btn); // Buttom to show Toast message
        // menu items
        wrts = findViewById(R.id.WRTS); // White Rice and Tomato Stew
        wrcs = findViewById(R.id.WRCS); // White Rice and Chicken Sauce
        jr = findViewById(R.id.JR); // Jollof Rice
        esy = findViewById(R.id.ESY); // Egg Sauce with Yam
        spag = findViewById(R.id.Spag); // Spaghetti
        pse = findViewById(R.id.PSE); // Plantian and Egg Sauce
        bp = findViewById(R.id.BP); // Beand Porridge
        abacha = findViewById(R.id.Abacha); // Abacha
        salad = findViewById(R.id.Salad); // Salad
        fp = findViewById(R.id.FP); // Fried Plantain
        yff = findViewById(R.id.YFF); // Yam and Fio Fio
        cr = findViewById(R.id.CR); // Coconut Rice
        esaucey = findViewById(R.id.ESauceY); // Egg Stew with Yam
        egusi = findViewById(R.id.EGUSI); // Egusi Soup
        veg = findViewById(R.id.VEGETABLE); // Vegetable Soup
        ogbono = findViewById(R.id.OGBONO); // Ogbono Soup
        okro = findViewById(R.id.OKRO); // Okro Soup
        oha = findViewById(R.id.OHA); // Oha Soup
        ofe = findViewById(R.id.OFE); // Ofe Soup
        banga = findViewById(R.id.BANGA); // Banga Soup
        stew = findViewById(R.id.STEW); // Stew
        beef = findViewById(R.id.BEEF); // Beef
        fish = findViewById(R.id.F_FISH); // Fried Fish
        moi_moi = findViewById(R.id.MOI_MOI); // Moi Moi
        chicken = findViewById(R.id.CHICKEN); // Chicken
        egg = findViewById(R.id.EGG); // Boiled Egg
        froll = findViewById(R.id.F_ROLL); // Fish Roll
        donut = findViewById(R.id.DOUGHNUT); // Doughnut
        chin = findViewById(R.id.CHIN); // Chin Chin
        pie = findViewById(R.id.PIE); // MeatPie
        puff = findViewById(R.id.PUFF); // Puff Puff
        bread = findViewById(R.id.BREAD); // Brad Roll
        biscuit = findViewById(R.id.C_BISCUIT); // Coconut Biscuit
        delivery = findViewById(R.id.delivery); // Hostel Delivery Fee

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (order.isPressed()) {
                        Toast.makeText(getBaseContext(), "Your order has been placed", Toast.LENGTH_LONG).show();
                    }
            }
        });


        wrts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        wrcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        jr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        esy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        spag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        pse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        abacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        yff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        esaucey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        egusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        ogbono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        okro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        oha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        ofe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        banga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        stew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        moi_moi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        froll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        puff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        biscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
            }
        });



    }

    private void compute() {

        // White rice and Tomato stew
        if (wrts.isChecked()) {
                wrts_cost = 200;
            } else {
                wrts_cost = 0;
            }

        // White rice and Chicken sauce
        if (wrcs.isChecked()) {
                wrcs_cost = 200;
            } else {
                wrcs_cost = 0;
            }

        // Jollof Rice
            if (jr.isChecked()) {
                jr_cost = 150;
            } else {
                jr_cost = 0;
            }

        // Egg Sauce with Yam
            if (esy.isChecked()) {
                esy_cost = 200;
            } else {
                esy_cost = 0;
            }

        // Spaghetti
                if (spag.isChecked()) {
                    spag_cost = 200;
                } else {
                    spag_cost = 0;
                }

        // Pancake and Scramble Egg
                if (pse.isChecked()) {
                    pse_cost = 200;
                } else {
                    pse_cost = 0;
                }

        // Beans Porridge
                if (bp.isChecked()) {
                    bp_cost = 150;
                } else {
                    bp_cost = 0;
                }

        // Abacha
                if (abacha.isChecked()) {
                    abacha_cost = 150;
                } else {
                    abacha_cost = 0;
                }

        // Salad
                if (salad.isChecked()) {
                    salad_cost = 50;
                } else {
                    salad_cost = 0;
                }

        // Fried Plantain
                if (fp.isChecked()) {
                    fp_cost = 150;
                } else {
                    fp_cost = 0;
                }

        // Yam and Fio Fio
                if (yff.isChecked()) {
                    yff_cost = 250;
                } else {
                    yff_cost = 0;
                }

        // Coconut Rice
                if (cr.isChecked()) {
                    cr_cost = 150;
                } else {
                    cr_cost = 0;
                }

        // Egg Sauce with Yam
                if (esaucey.isChecked()) {
                    esaucey_cost = 200;
                } else {
                    esaucey_cost = 0;
                }

        // Egusi Soup
                if (egusi.isChecked()) {
                    egusi_cost = 100;
                } else {
                    egusi_cost = 0;
                }

        // Vegetable Soup
                if (veg.isChecked()) {
                    veg_cost = 100;
                } else {
                    veg_cost = 0;
                }

        // Ogbono Soup
                if (ogbono.isChecked()) {
                    ogbono_cost = 100;
                } else {
                    ogbono_cost = 0;
                }

        // Okro Soup
                if (okro.isChecked()) {
                    okro_cost = 100;
                } else {
                    okro_cost = 0;
                }

        // Ofe Akwu Soup
                if (ofe.isChecked()) {
                    ofe_cost = 100;
                } else {
                    ofe_cost = 0;
                }

        // Banga Soup
                if (banga.isChecked()) {
                    banga_cost = 50;
                } else {
                    banga_cost = 0;
                }

        // Stew
                if (stew.isChecked()) {
                    stew_cost = 50;
                } else {
                    stew_cost = 0;
                }

        // Moi Moi
                if (moi_moi.isChecked()) {
                    moi_moi_cost = 100;
                } else {
                    moi_moi_cost = 0;
                }

        // Chicken
                if (chicken.isChecked()) {
                    chicken_cost = 300;
                } else {
                    chicken_cost = 0;
                }

        // Beef
                if (beef.isChecked()) {
                    beef_cost = 100;
                } else {
                    beef_cost = 0;
                }

        // Fish
                if (fish.isChecked()) {
                    fried_fish_cost = 100;
                } else {
                    fried_fish_cost = 0;
                }

        // Bioled Egg
                if (egg.isChecked()) {
                    bioled_egg_cost = 50;
                } else {
                    bioled_egg_cost = 0;
                }

        // Fish Roll
                if (froll.isChecked()) {
                    froll_cost = 200;
                } else {
                    froll_cost = 0;
                }

        // Doughnut
                if (donut.isChecked()) {
                    donut_cost = 150;
                } else {
                    donut_cost = 0;
                }

        // Chin Chin
                if (chin.isChecked()) {
                    chin_cost = 100;
                } else {
                    chin_cost = 0;
                }

        // Meat Pie
                if (pie.isChecked()) {
                    pie_cost = 200;
                } else {
                    pie_cost = 0;
                }

        // Puff Puff
                if (puff.isChecked()) {
                    puff_cost = 100;
                } else {
                    puff_cost = 0;
                }

        // Bread Roll
                if (bread.isChecked()) {
                    bread_cost = 400;
                } else {
                    bread_cost = 0;
                }

        // Coconut Biscuit
                if (biscuit.isChecked()) {
                    bicuit_cost = 250;
                } else {
                    bicuit_cost = 0;
                }

                if (delivery.isChecked()) {
                    delivery_cost = 50;
                } else {
                    delivery_cost = 0;
                }



        Integer total  = wrts_cost + wrcs_cost + jr_cost + esy_cost + spag_cost + pse_cost + bp_cost + abacha_cost + salad_cost +
                fp_cost + yff_cost + cr_cost + esaucey_cost + egusi_cost + veg_cost + ogbono_cost + okro_cost + oha_cost +
                ofe_cost + banga_cost + stew_cost + moi_moi_cost + chicken_cost + beef_cost + fried_fish_cost + bioled_egg_cost +
                froll_cost + donut_cost + chin_cost + pie_cost + puff_cost + bread_cost + bicuit_cost + delivery_cost;

                main.setText(getString(R.string.amount, total ));
    }


}
