/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalcTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;


@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {

        mCalculator = new Calculator();
    }


    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.addition(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative(){
        double resultAdd = mCalculator.addition(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersFloats(){
        double resultAdd = mCalculator.addition(1.111f, 1.111d);
        assertThat(resultAdd, is(closeTo(2.222d, 0.01)));
    }

    @Test
    public void subTwoNumbers(){
        double resultSub = mCalculator.subtraction(2d, 1d);
        assertThat(resultSub, is(equalTo(1d)));
    }

    @Test
    public void subWorksWithNegativeResults(){
        double resultSub = mCalculator.subtraction(2d, 10d);
        assertThat(resultSub, is(equalTo(-8d)));
    }

    @Test
    public void mulTwoNumbers(){
        double resultMul = mCalculator.multiplication(16d, 2d);
        assertThat(resultMul, is(equalTo(32d)));
    }

    @Test
    public void mulTwoNumbersZero(){
        double resultMul = mCalculator.multiplication(16d, 0d);
        assertThat(resultMul, is(equalTo(0d)));
    }

    @Test
    public void divTwoNumbers(){
        double resultDiv = mCalculator.division(16d, 2d);
        assertThat(resultDiv, is(equalTo(8d)));
    }

    @Test
    public void divByZero(){
        double resultDiv = mCalculator.division(16d, 0d);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }


}