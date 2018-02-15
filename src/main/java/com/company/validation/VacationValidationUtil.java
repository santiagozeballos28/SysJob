
package com.company.validation;

import com.company.tools.ConstantData;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 *
 * @author santiago.mamani
 */
public class VacationValidationUtil {
     public static boolean isUsAscii(String name) {
        CharsetEncoder asciiEncoder = Charset.forName(ConstantData.US_ASCII).newEncoder();
        return asciiEncoder.canEncode(name);
    }    
}
