/*
 * NextBill Android client application
 *
 * @author Michael Roedel
 * Copyright (c) 2020 Michael Roedel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.nextbill.client.interfaces;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class XAxisGeneralFormatter implements IAxisValueFormatter{

    Map<BigDecimal, String> xAxesValues = new HashMap<>();

    public XAxisGeneralFormatter(Map<BigDecimal, String> xAxesValues) {
        this.xAxesValues = xAxesValues;
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {

        for (BigDecimal xBigDecimal : xAxesValues.keySet()) {

            BigDecimal xValueTmp = xBigDecimal;
            xValueTmp = xValueTmp.remainder(new BigDecimal(999999));

            float axesValue = xValueTmp.floatValue();
            if (axesValue == value){
                return xAxesValues.get(xBigDecimal);
            }
        }

        return "";
    }
}
