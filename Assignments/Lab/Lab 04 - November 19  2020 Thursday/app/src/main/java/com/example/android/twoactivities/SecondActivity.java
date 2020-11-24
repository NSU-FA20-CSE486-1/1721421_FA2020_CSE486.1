/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_ITEMS = "com.example.android.twoactivities.extra.ITEMS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void selectItem(View view) {
        Intent return_items_intent = new Intent();

        switch (view.getId()){
            case R.id.button_Chocolate:
                return_items_intent.putExtra(EXTRA_ITEMS, "Chocolate"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_oil:
                return_items_intent.putExtra(EXTRA_ITEMS, "Oil"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_milk:
                return_items_intent.putExtra(EXTRA_ITEMS, "Milk"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_eggs:
                return_items_intent.putExtra(EXTRA_ITEMS, "Eggs"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_cheese:
                return_items_intent.putExtra(EXTRA_ITEMS, "Cheese"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_rice:
                return_items_intent.putExtra(EXTRA_ITEMS, "Rice"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_wheat:
                return_items_intent.putExtra(EXTRA_ITEMS, "Wheat Flour"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_bread:
                return_items_intent.putExtra(EXTRA_ITEMS, "Bread"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_sugar:
                return_items_intent.putExtra(EXTRA_ITEMS, "Sugar"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_salt:
                return_items_intent.putExtra(EXTRA_ITEMS, "Salt"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            default:
                Toast.makeText(SecondActivity.this, "Error :(", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
