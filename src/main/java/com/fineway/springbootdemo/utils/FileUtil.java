package com.fineway.springbootdemo.utils;

import java.io.*;

public class FileUtil {
    public static void writeErrorMsg(String errorMsg) {
        String errorLogFilePath="H:/workspace-idea/error.txt";
        File file = new File(errorLogFilePath);
        if(!file.exists()){
            System.out.println("日志文件不存在【"+file.getPath()+"】");
            return;
        }
        //String split ="";
        try {
            Writer writer = new FileWriter(file,true);
            writer.write(errorMsg+"\n\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("【IO异常】日志记录失败");
        }
    }

    /**
     *
     * @param path
     * @param msg
     * @param cover
     */
    public static void writeStringToFile(String path,String msg,boolean cover) {
        if(msg==null){
            System.out.println("无数据!");
            return;
        }
        File file = new File(path);
        try {
            Writer writer = new FileWriter(file,cover);
            writer.write(msg);
            //不写close需写flush 把缓存区中的数据刷新近文件
            writer.flush();
            System.out.println("【"+file.getName()+"】创建成功");
        } catch (IOException e) {
            System.out.println("【IO异常】写入文件失败");
        }
    }

    public static String getStringFromJSONFile(String path,String charset){
        BufferedReader reader;
        File json = new File(path);
        if(json==null||!json.exists()||!json.getName().endsWith(".json")) {
            System.out.println("路径错误【"+path+"】");
            return null;
        }
        try {
            if (charset!=null) {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(json), charset));
            }else {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(json)));
            }
            String line;
            StringBuffer sb =new StringBuffer();
            while((line=reader.readLine())!=null) {
                sb.append(line);
            }
            //jsonObj=(Map<String, Object>) JSON.parse(sb.toString());
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){

        }
        return null;
    }
}
