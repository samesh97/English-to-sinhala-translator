package com.crave.food.myapplication;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForAmmaTranslator
{

    private static final String TAG = "translateToSinhala";

    public static StringBuilder translateToSinhala(String string)
    {
        StringBuilder returnText = new StringBuilder();

        List<String> list = splitBySpaces(string);
        for(String st : list)
        {
            if(!st.trim().isEmpty())
            {
                StringBuilder builder = translateWord(st);
                if(builder != null)
                {
                    returnText.append(" ").append(builder.toString());
                }

            }

        }
        return returnText;

    }

    private static StringBuilder translateWord(String string)
    {
        if(string.trim().isEmpty())
        {
            return null;
        }

        StringBuilder myText = new StringBuilder(string);
        StringBuilder returnText = new StringBuilder("");


            for(int i = 0; i < myText.length(); i++)
            {
                String value = Character.toString(myText.charAt(i));

                if(value.trim().isEmpty())
                {
                   continue;
                }

                if(value.equals("a") || value.equals("A"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(nextKeyValue.equals("a"))
                        {
                            returnText.append("ආ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else if(nextKeyValue.equals("i"))
                        {
                            returnText.append("ඓ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else if(nextKeyValue.equals("u"))
                        {
                            returnText.append("ඖ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else
                        {
                            returnText.append("අ");
                        }

                    }
                    else
                    {
                        returnText.append("අ");
                    }

                }
                else if(value.equals("i") || value.equals("I"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(nextKeyValue.equals("i"))
                        {
                            returnText.append("ඊ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else
                        {
                            returnText.append("ඉ");
                        }

                    }
                    else
                    {
                        returnText.append("ඉ");
                    }
                }
                else if(value.equals("u") || value.equals("U"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(nextKeyValue.equals("u"))
                        {
                            returnText.append("ඌ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else
                        {
                            returnText.append("උ");
                        }

                    }
                    else
                    {
                        returnText.append("උ");
                    }
                }
                else if(value.equals("e") || value.equals("E"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(nextKeyValue.equals("e"))
                        {
                            returnText.append("ඒ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else
                        {
                            returnText.append("එ");
                        }

                    }
                    else
                    {
                        returnText.append("එ");
                    }
                }
                else if(value.equals("o") || value.equals("O"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(nextKeyValue.equals("o"))
                        {
                            returnText.append("ඕ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else if(nextKeyValue.equals("u"))
                        {
                            returnText.append("ඖ");
                            myText.setCharAt(i + 1, ' ');
                        }
                        else
                        {
                            returnText.append("ඔ");
                        }

                    }
                    else
                    {
                        returnText.append("ඔ");
                    }
                }
                else if(value.equals("k") || value.equals("K"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 3))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));



                            if (nextKeyValue.equals("r") && nextNextKeyValue.equals("u") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("කෲ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඛ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("කෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("කෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("කා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("කී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("කූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("r") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("කෘ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("කේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("කෛ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("කෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }

                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("කෞ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("H"))
                            {
                                returnText.append("කඃ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("X"))
                            {
                                returnText.append("කඞ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("y") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ක්\u200Dය");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("r") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ක්\u200Dර");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }

                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("කැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("කො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("කෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("කි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("කු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ක");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ක්");
                            }
                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඛ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("කෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("කෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("කා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("කී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("කූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("r") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("කෘ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("කෛ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("කේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("කෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("කෞ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("H"))
                            {
                                returnText.append("කඃ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("X"))
                            {
                                returnText.append("කඞ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("y") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ක්\u200Dය");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("r") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ක්\u200Dර");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("කො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("කෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("කැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("කි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("කු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ක");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ක්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("A"))
                            {
                                returnText.append("කැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("කො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("කෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("කි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("කු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ක");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ක්");
                            }
                        }

                    }
                    else
                    {
                        returnText.append("ක්");
                    }
                }
                else if(value.equals("g") || value.equals("G"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 3))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));

                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඝා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ගා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ගී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ගූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ගේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("ගෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("ගෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ගෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ගි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ගු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ගෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ගො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ගැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ග");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ග්");
                            }
                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ගා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ගී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ගූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ගේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("ගෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("ගෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ගෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ගි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ගු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ගෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ගො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ගැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ග");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ග්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ග");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ගි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ගු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ගෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ගො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ගැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ග්");
                            }
                        }

                    }
                    else
                    {
                        returnText.append("ග්");
                    }
                }
                else if(value.equals("c") || value.equals("C"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 3))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));


                            if(nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඡ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("a") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("චා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("u") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("චූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("i") && nextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("චී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("e") && nextNextNextKeyValue.equals("e"))
                            {
                                returnText.append("චේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("o") && nextNextNextKeyValue.equals("o"))
                            {
                                returnText.append("චෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("A"))
                            {
                                returnText.append("චෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("චෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ච");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("චි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("චු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("චො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("චෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("චැ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ච්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ක්");
                            }

                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            if(nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ච");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("චි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("චු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("චො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("චෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("චැ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ච්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ක්");
                            }

                        }
                        else
                        {
                            if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ච්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ක්");
                            }
                        }

                    }
                    else
                    {
                        returnText.append("ක්");
                    }
                }
                else if(value.equals("j") || value.equals("J"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ජා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ජී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ජේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("ජෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("ජෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ජෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ජූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ජ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ජි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ජු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ජෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ජො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ජැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ජ්");
                            }

                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ජ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ජි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ජු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ජෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ජො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ජැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ජ්");
                            }
                        }
                    }
                    else
                    {
                        returnText.append("ජ්");
                    }
                }
                else if(value.equals("t") || value.equals("T"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                            if(myText.length() > (i + 3))
                            {
                                String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                                String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));

                                if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("a"))
                                {
                                    returnText.append("ථ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a") && nextNextNextKeyValue.equals("a"))
                                {
                                    returnText.append("තා");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i") && nextNextNextKeyValue.equals("i"))
                                {
                                    returnText.append("තී");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o") && nextNextNextKeyValue.equals("o"))
                                {
                                    returnText.append("තෝ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u") && nextNextNextKeyValue.equals("u"))
                                {
                                    returnText.append("තූ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("A"))
                                {
                                    returnText.append("තෑ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("a"))
                                {
                                    returnText.append("තෑ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                    myText.setCharAt(i + 3, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                                {
                                    returnText.append("ත");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                                {
                                    returnText.append("ති");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                                {
                                    returnText.append("තො");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                                {
                                    returnText.append("තු");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                                {
                                    returnText.append("තැ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                                {
                                    returnText.append("ටූ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                                {
                                    returnText.append("ටා");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                                {
                                    returnText.append("ටෑ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                                {
                                    returnText.append("ටෑ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                                {
                                    returnText.append("ටේ");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                                {
                                    returnText.append("ටී");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }
                                else if(nextKeyValue.equals("h"))
                                {
                                    returnText.append("ත්");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else if(nextKeyValue.equals("a"))
                                {
                                    returnText.append("ට");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else if(nextKeyValue.equals("u"))
                                {
                                    returnText.append("ටු");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else if(nextKeyValue.equals("i"))
                                {
                                    returnText.append("ටි");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else if(nextKeyValue.equals("o"))
                                {
                                    returnText.append("ටො");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else if(nextKeyValue.equals("e"))
                                {
                                    returnText.append("ටෙ");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else if(nextKeyValue.equals("A"))
                                {
                                    returnText.append("ටැ");
                                    myText.setCharAt(i + 1, ' ');
                                }
                                else
                                {
                                    returnText.append("ට්");
                                }
                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ත");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ති");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("තො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("තු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("තැ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ටූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ටා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("ටෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ටෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ටේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ටී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ත්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ට");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ටු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ටි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ටො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ටෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ටැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ට්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ට");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ත්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ටු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ටො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ටි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ටෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ටැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ට්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ට්");
                    }
                }
                else if(value.equals("d") || value.equals("D"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 4))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));
                            String nextNextNextNextKeyValue = Character.toString(myText.charAt(i + 4));


                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("a") && nextNextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ධා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                                myText.setCharAt(i + 4, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("i") && nextNextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("ධී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                                myText.setCharAt(i + 4, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("u") && nextNextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("ධූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                                myText.setCharAt(i + 4, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("o") && nextNextNextNextKeyValue.equals("o"))
                            {
                                returnText.append("ධෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                                myText.setCharAt(i + 4, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ධ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("ධු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("e"))
                            {
                                returnText.append("ධෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("ධි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("දා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i") && nextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("දී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e") && nextNextNextKeyValue.equals("e"))
                            {
                                returnText.append("දේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o") && nextNextNextKeyValue.equals("o"))
                            {
                                returnText.append("දෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("දූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("A"))
                            {
                                returnText.append("දෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("දෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ද");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("දු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("දැ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("දි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("දෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("දො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඩා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ඩී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ඩේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ඩූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ඩි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ද්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ඩො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ඩු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ඩෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ඩ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ඩ්");
                            }
                        }
                        else if(myText.length() > (i + 3))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));

                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ධ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("ධු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("e"))
                            {
                                returnText.append("ධෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("ධි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("දා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i") && nextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("දී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e") && nextNextNextKeyValue.equals("e"))
                            {
                                returnText.append("දේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o") && nextNextNextKeyValue.equals("o"))
                            {
                                returnText.append("දෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("දූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("A"))
                            {
                                returnText.append("දෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("දෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ද");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("දු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("දැ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("දි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("දෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("දො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඩා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ඩී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ඩේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ඩූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ඩි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ද්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ඩො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ඩු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ඩෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ඩ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ඩ්");
                            }
                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ද");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("දි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("දු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("දැ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("දෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("දො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඩා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ඩී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ඩේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ඩූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ඩ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ඩි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ද්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ඩො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ඩු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ඩෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ඩ්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ඩ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ඩි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ද්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ඩො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ඩු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ඩෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ඩ්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ඩ්");
                    }
                }
                else if(value.equals("n") || value.equals("N"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("නා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("නී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("නේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("නෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("නෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("නෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("නූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("න");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("නි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("නෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("නො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("නැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("නු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("න්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("න");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("නි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("නෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("නො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("නැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("නු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("න්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("න්");
                    }
                }
                else if(value.equals("b") || value.equals("B"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("බා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("බී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("බේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("බෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("බූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("බෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("බෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("භ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("බ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("බි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("බෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("බො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("බු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("බැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("බ්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("බ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("බි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("බෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("බො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("බු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("බැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("බ්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("බ්");
                    }
                }
                else if(value.equals("m") || (value.equals("M")))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            if(nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("මා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("මෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("මී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("මේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("මූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("මෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("මෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ම");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("මො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("මි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("මෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("මු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("මැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ම්");
                            }

                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ම");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("මො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("මි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("මෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("මු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("මැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ම්");
                            }
                        }

                    }
                    else
                    {
                        returnText.append("ම්");
                    }
                }
                else if(value.equals("y") || value.equals("Y"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));


                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));


                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                if((i - 1) >= 0)
                                {
                                    String preKeyValue = Character.toString(myText.charAt(i - 1));
                                    if(!preKeyValue.equals("a") && !preKeyValue.equals("e") && !preKeyValue.equals("i") && !preKeyValue.equals("o") && !preKeyValue.equals("u"))
                                    {
                                            returnText.append("\u200Dයා");
                                            myText.setCharAt(i + 1, ' ');
                                            myText.setCharAt(i + 2, ' ');

                                        Log.d(TAG, "translateWord:  " + preKeyValue);
                                    }


                                }
                                else
                                {
                                    returnText.append("යා");
                                    myText.setCharAt(i + 1, ' ');
                                    myText.setCharAt(i + 2, ' ');
                                }

                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("යී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("යේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("යෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("යූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("යෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("යෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                if((i - 1) >= 0)
                                {
                                    String preKeyValue = Character.toString(myText.charAt(i - 1));
                                    if(!preKeyValue.equals("a") && !preKeyValue.equals("e") && !preKeyValue.equals("i") && !preKeyValue.equals("o") && !preKeyValue.equals("u"))
                                    {
                                        returnText.append("\u200Dය");
                                        myText.setCharAt(i + 1, ' ');

                                    }


                                }
                                else
                                {
                                    returnText.append("ය");
                                    myText.setCharAt(i + 1, ' ');
                                }
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("යි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("යෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("යො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("යු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("යැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ය්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                if((i - 1) >= 0)
                                {
                                    String preKeyValue = Character.toString(myText.charAt(i - 1));
                                    if(!preKeyValue.equals("a") && !preKeyValue.equals("e") && !preKeyValue.equals("i") && !preKeyValue.equals("o") && !preKeyValue.equals("u"))
                                    {
                                        returnText.append("\u200Dය");
                                        myText.setCharAt(i + 1, ' ');

                                    }


                                }
                                else
                                {
                                    returnText.append("ය");
                                    myText.setCharAt(i + 1, ' ');
                                }

                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("යි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("යෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("යො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("යු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("යැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ය්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ය්");
                    }
                }
                else if(value.equals("r") || value.equals("R"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("රා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("රේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("රී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("රූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("රෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("රෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ර");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("රෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("රි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("රු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("රැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ර්");
                            }
                        }
                        else
                        {

                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ර");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("රෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("රි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("රු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("රැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ර්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ර්");
                    }
                }
                else if(value.equals("l") || value.equals("L"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ලා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ලේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("ලෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ලී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ලූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("ලෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ලෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ල");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ලෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ලො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ලි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ලු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ලැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ල්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ල");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ලෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("ලො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ලි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ලු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ලැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ල්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ල්");
                    }
                }
                else if(value.equals("w") || value.equals("v") || value.equals("W") || value.equals("V"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("වා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("වේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("වූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("වී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("වෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("වෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ව");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("වෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("වු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("වි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("වැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ව්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ව");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("වෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("වු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("වි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("වැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ව්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ව්");
                    }
                }
                else if(value.equals("s") || value.equals("S"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 3))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));

                            if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ශා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i") && nextNextNextKeyValue.equals("i"))
                            {
                                returnText.append("ශී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e") && nextNextNextKeyValue.equals("e"))
                            {
                                returnText.append("ශේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o") && nextNextNextKeyValue.equals("o"))
                            {
                                returnText.append("ශෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u") && nextNextNextKeyValue.equals("u"))
                            {
                                returnText.append("ශූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("A"))
                            {
                                returnText.append("ශෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("A") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ශෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            else if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("සා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("සේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("සෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("සී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("සූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("සෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("සෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ශ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ශි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ශෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("ශො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ශු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ස");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("සෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("සො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("සි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("සු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("සැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ශ්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ස්");
                            }
                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("සා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("සේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("සෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("සී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("සූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("සෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("සෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ශ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ශි");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ශෙ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("ශො");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ශු");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ස");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("සෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("සො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("සි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("සු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("සැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ශ්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ස්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ස");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("සෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("සො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("සි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("සු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("සැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("h"))
                            {
                                returnText.append("ශ්");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ස්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ස්");
                    }
                }
                else if(value.equals("h") || value.equals("H"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("හා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("හේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("හෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("හී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("හූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("හෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("හෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("හ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("හෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("හො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("හි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("හු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("හැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("හ්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("හ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("හෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("හො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("හි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("හු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("හැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("හ්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("හ්");
                    }
                }
                else if(value.equals("f") || value.equals("F"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ෆා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("ෆේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("ෆී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("ෆූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("ෆෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ෆෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ෆ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ෆෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ෆි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ෆු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ෆැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ෆ්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ෆ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("ෆෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("ෆි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("ෆු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("ෆැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ෆ්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ෆ්");
                    }
                }
                else if(value.equals("p") || value.equals("P"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("a") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("පා");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("e") && nextNextKeyValue.equals("e"))
                            {
                                returnText.append("පේ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("o") && nextNextKeyValue.equals("o"))
                            {
                                returnText.append("පෝ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("i") && nextNextKeyValue.equals("i"))
                            {
                                returnText.append("පී");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("u") && nextNextKeyValue.equals("u"))
                            {
                                returnText.append("පූ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("A"))
                            {
                                returnText.append("පෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("A") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("පෑ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඵ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ප");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("පෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("පො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("පි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("පු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("පැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ප්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
                                returnText.append("ප");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("e"))
                            {
                                returnText.append("පෙ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("o"))
                            {
                                returnText.append("පො");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("i"))
                            {
                                returnText.append("පි");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("u"))
                            {
                                returnText.append("පු");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else if(nextKeyValue.equals("A"))
                            {
                                returnText.append("පැ");
                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                returnText.append("ප්");
                            }
                        }


                    }
                    else
                    {
                        returnText.append("ප්");
                    }
                }
                else if(value.equals("z"))
                {
                    if(myText.length() > (i + 1))
                    {
                        String nextKeyValue = Character.toString(myText.charAt(i + 1));

                        if(myText.length() > (i + 3))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));
                            String nextNextNextKeyValue = Character.toString(myText.charAt(i + 3));

                            if (nextKeyValue.equals("d") && nextNextKeyValue.equals("h") && nextNextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඳ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                                myText.setCharAt(i + 3, ' ');
                            }
                            if (nextKeyValue.equals("g") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඟ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("d") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඬ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("j") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඦ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("k") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඤ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඥ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
    //                                returnText.append("ප");
    //                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                //returnText.append("ප්");
                            }
                        }
                        else if(myText.length() > (i + 2))
                        {
                            String nextNextKeyValue = Character.toString(myText.charAt(i + 2));

                            if (nextKeyValue.equals("g") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඟ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("d") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඬ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("j") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඦ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("k") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඤ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if (nextKeyValue.equals("h") && nextNextKeyValue.equals("a"))
                            {
                                returnText.append("ඥ");
                                myText.setCharAt(i + 1, ' ');
                                myText.setCharAt(i + 2, ' ');
                            }
                            else if(nextKeyValue.equals("a"))
                            {
//                                returnText.append("ප");
//                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                                //returnText.append("ප්");
                            }
                        }
                        else
                        {
                            if(nextKeyValue.equals("a"))
                            {
//                                returnText.append("ප");
//                                myText.setCharAt(i + 1, ' ');
                            }
                            else
                            {
                               // returnText.append("ප්");
                            }
                        }


                    }
                    else
                    {
                        //returnText.append("ප්");
                    }
                }
                else if(value.equals("x"))
                {
                    returnText.append("ං");
                }
                else
                {
                    returnText.append(value);
                }

            }

        return returnText;
    }



    public static List<String> splitBySpaces(String string)
    {

        List<String> list = new ArrayList<>();
        if(!string.isEmpty())
        {
            //trim
            string.trim();

            list.addAll(Arrays.asList(string.split(" ")));
        }
        return list;
    }
}
