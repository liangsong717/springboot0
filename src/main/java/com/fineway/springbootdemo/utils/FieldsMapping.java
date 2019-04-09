package com.fineway.springbootdemo.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FieldsMapping {

    public static String mapping2016To2018(String codes) {
        if(codes==null){return null;}
        String[] codeArray = codes.split(",");
        if(codeArray.length==0){return null;}
        Map<String, String> mapper2016_2018 = getMapper2016_2018();
        StringBuilder defaultCodes = new StringBuilder();
        StringBuilder builder= new StringBuilder();
        for (String code:codeArray) {
            String value = mapper2016_2018.get(code);
            if(value==null){
                //System.out.println("无法匹配code【"+code+"】");
                defaultCodes.append(code+";");
            }
            builder.append(value+",");
        }
        if(defaultCodes.length()>0){
            System.out.println("无法匹配以下codes【"+defaultCodes.toString()+"】");
        }
        if(builder.length()>0){
            builder.deleteCharAt(builder.length()-1);
        }
        return builder.toString();
    }


    public static <T> T reflactSetProperties(T obj,String fields,String datas){
        StringBuilder defaultFields = new StringBuilder();
        if(obj==null){return null;}
        String[] fieldArray = fields.split(",");
        String[] dataArray = datas.split(",");
        if(fieldArray.length!=dataArray.length){
            FileUtil.writeErrorMsg("字段数量【"+fieldArray.length+"】与所对应的值的数量【"+dataArray.length+"】不一致");
            return null;
        }
        boolean hasField=false;
        for (int i=0;i<fieldArray.length;i++) {
            String field=fieldArray[i];
            if (field!=null&&!"".equals(field)&&!"null".equals(field)) {
                try {
                    Field property = obj.getClass().getDeclaredField(field);
                    property.setAccessible(true);
                    property.set(obj,dataArray[i]);
                    hasField=true;
                } catch (NoSuchFieldException e) {
                    //System.out.println("无此字段【"+field+"】");
                    defaultFields.append(field+";");
                } catch (IllegalAccessException e) {
                    //e.printStackTrace();
                    System.out.println("【"+field+"】字段赋值【"+dataArray[i]+"】失败");
                }
            }
        }
        if(defaultFields.length()>0){
            System.out.println("无以下字段【"+defaultFields.toString()+"】");
        }
        if(hasField){
            return obj;
        }else{
            return null;
        }
    }

    private static Map<String,String> getMapper2016_2018(){
        Map<String,String> mapper = new HashMap<>();
        mapper.put("GT01","ltjhtczb");
        mapper.put("GT02","ltjhyjcn");
        mapper.put("GT03","lttclx");
        mapper.put("GT04","lgjhtczb");
        mapper.put("GT05","lgjhyjcn");
        mapper.put("GT06","lgtclx");
        mapper.put("GT07","qysfzttc");
        mapper.put("GT08","ltjhtcsj");
        mapper.put("GT10","lgjhtcsj");
        mapper.put("GT201","ltbytczb");
        mapper.put("GT202","ltbyyjcn");
        mapper.put("GT203","ltsjtcsj");
        mapper.put("GT204","ltbysftc");
        mapper.put("GT205","lgbytczb");
        mapper.put("GT206","lgbyyjcn");
        mapper.put("GT207","lgsjtcsj");
        mapper.put("GT208","lgbysftc");
        mapper.put("GT31","jhtqty");
        mapper.put("GT32","jhyfjcht");
        mapper.put("GT33","jhnbaz");
        mapper.put("GT330012","zzjgdm");
        mapper.put("GT330013","xydm");
        mapper.put("GT330301","ltsftc");
        //mapper.put("GT330302","炼铁停产时间");
        mapper.put("GT330303","lgsftc");
        //mapper.put("GT330304","炼钢停产时间");
        mapper.put("GT330305","ltbyyjcn");
        mapper.put("GT330306","lgbyyjcn");
        mapper.put("GT34","qtjh");
        mapper.put("GT35","jhtqty");
        mapper.put("GT351","ltywctczb");
        mapper.put("GT3511","ywctqty");
        mapper.put("GT3512","ywcyfjcht");
        mapper.put("GT3513","ywcnbaz");
        mapper.put("GT3514","ywcqtjh");
        mapper.put("GT352","ltywcyjcn");
        mapper.put("GT3521","name");
        mapper.put("GT3522","sjjrjgmc");
        mapper.put("GT3523","sjje");
        mapper.put("GT3524","qkms");
        mapper.put("GT3525","sfxdfjrjgfy");
        mapper.put("GT3526","dfjrjghfyj");
        mapper.put("GT3527","qysq");
        mapper.put("GT3528","zcczqk");
        mapper.put("GT353","ltsjtcsj");
        mapper.put("GT3531","yccsbxhjsl");
        mapper.put("GT3532","yccsbsfcdbc");
        mapper.put("GT3533","wccsbxhjsl");
        mapper.put("GT3534","wccsbsfgs");
        mapper.put("GT3535","wccsbsfys");
        mapper.put("GT3536","yccsbsfys");
        mapper.put("GT3537","zfwzsfgs");
        mapper.put("GT354","ltbysftc");
        mapper.put("GT3541","sczdzywt");
        mapper.put("GT355","lgywctczb");
        mapper.put("GT356","lgywcyjcn");
        mapper.put("GT357","lgsjtcsj");
        mapper.put("GT358","lgbysftc");
        mapper.put("GT359","qysfzttc");
        mapper.put("GT36","jhyfjcht");
        mapper.put("GT37","jhnbaz");
        mapper.put("GT38","qtjh");
        mapper.put("GT601","name");
        mapper.put("GT602","sjjrjgmc");
        mapper.put("GT603","sjje");
        mapper.put("GT604","qkms");
        mapper.put("GT605","sfxdfjrjgfy");
        mapper.put("GT606","dfjrjghfyj");
        mapper.put("GT607","qysq");
        mapper.put("GT701","yccsbxhjsl");
        mapper.put("GT702","yccsbsfcdbc");
        mapper.put("GT703","wccsbxhjsl");
        mapper.put("GT704","wccsbsfgs");
        mapper.put("GT705","wccsbsfys");
        mapper.put("GT706","yccsbsfys");
        mapper.put("GT707","zfwzsfgs");
        mapper.put("M71","tcmkmc");
        mapper.put("MT01","tcmkmc");
        mapper.put("MT02","hdnl");
        mapper.put("MT03","tclx");
        mapper.put("MT31","jhtqty");
        mapper.put("MT32","jhyfjcht");
        mapper.put("MT33","jhnbaz");
        mapper.put("MT34","qtjh");
        mapper.put("MT340006","zzjgdm");
        mapper.put("MT35","tqty");
        mapper.put("MT36","yfjcht");
        mapper.put("MT3601","tcmkmc");
        mapper.put("MT3611","ywctqty");
        mapper.put("MT3612","ywcyfjcht");
        mapper.put("MT3613","ywcnbaz");
        mapper.put("MT3614","ywcqtjh");
        mapper.put("MT3621","name");
        mapper.put("MT3622","sjjrjgmc");
        mapper.put("MT3623","sjje");
        mapper.put("MT3624","sczdzywt");
        mapper.put("MT3625","sfxdfjrjgfy");
        mapper.put("MT3626","dfjrjghfyj");
        mapper.put("MT3627","qysq");
        mapper.put("MT3628","zcczqk");
        mapper.put("MT3631","sftc");
        mapper.put("MT3632","jxsbsfhc");
        mapper.put("MT3633","jksffb");
        mapper.put("MT3634","zjsfzx");
        mapper.put("MT3636","sfys1");
        mapper.put("MT3641","qkms");
        mapper.put("MT37","nbaz");
        mapper.put("MT38","qtjh");
        mapper.put("MT40","zcczqk");
        mapper.put("MT51","sftc");
        mapper.put("MT52","jxsbsfhc");
        mapper.put("MT53","jksffb");
        mapper.put("MT54","zjsfzx");
        mapper.put("MT56","sfys1");
        mapper.put("MT61","name");
        mapper.put("MT62","sjjrjgmc");
        mapper.put("MT63","sjje");
        mapper.put("MT64","qkms");
        mapper.put("MT65","sfxdfjrjgfy");
        mapper.put("MT66","dfjrjghfyj");
        mapper.put("MT67","qysq");
        return mapper;
    }

    /**
     *
     * @param value2016
     * @param type  1:钢铁    2：煤炭
     * @return
     */
    public static String nameMapping2016T02018(String value2016,int type){
        String sub = "mt";
        if (type==1){
            sub="gt";
        }
        if (value2016==null||"".equals(value2016.trim())||"无".equals(value2016.trim())){
            return null;
        }else if("抽贷断贷影响正常生产经营".equals(value2016.trim())){
            return sub+"cddh";
        }else if("新建先进产能金融机构不支持".equals(value2016.trim())){
            return sub+"jrjg";
        }else if("涉及金融机构其它问题".equals(value2016.trim())){
            return sub+"sjjr";
        }else if("重组诉求地方金融机构未解决".equals(value2016.trim())){
            return sub+"czsq";
        }else{
            return null;
        }
    }

    public static String dualNullTo0(String s){
        if(s==null||"".equals(s.trim())||"无".equals(s.trim())){
            return "0";
        }
        Pattern p = Pattern.compile("[0-9]");
        Matcher matcher = p.matcher(s);
        if(matcher.find()){
            return s.trim();
        }else{
            return "0";
        }
    }

    public static String dualNullToWU(String s){
        if(s==null||"".equals(s.trim())||"-".equals(s.trim())||"0".equals(s.trim())||"否".equals(s.trim())||"、".equals(s.trim())){
            return "无";
        }else{
            return s.trim();
        }
    }

    public static String dualNullToFalse(String s){
        if(s==null||"".equals(s.trim())||"-".equals(s.trim())||"0".equals(s.trim())){
            return "false";
        }else{
            return s.trim();
        }
    }

    public static String dualNotNumToNull(String s) {
        if(s==null){return null;}
        Pattern p = Pattern.compile("[0-9A-Z]");
        Matcher matcher = p.matcher(s);
        if(matcher.find()){
            return s.trim();
        }else{
            return null;
        }
    }

    public static String dualNotNumToWU(String s) {
        if(s==null){return "无";}
        Pattern p = Pattern.compile("[0-9A-Z]");
        Matcher matcher = p.matcher(s);
        if(matcher.find()){
            return s.trim();
        }else{
            return "无";
        }
    }
}
