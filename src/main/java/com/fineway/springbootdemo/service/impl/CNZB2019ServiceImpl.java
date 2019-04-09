package com.fineway.springbootdemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.fineway.springbootdemo.dao.cnzb_now.mapper.HjcnHistoryNowMapper;
import com.fineway.springbootdemo.dao.cnzb_now.pojo.HjcnHistoryNow;
import com.fineway.springbootdemo.service.CNZB2019Service;
import com.fineway.springbootdemo.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CNZB2019ServiceImpl implements CNZB2019Service {

    @Autowired
    private HjcnHistoryNowMapper hisNowMapper;

    @Override
    public void test1() {
        String sql1="select * from hjcnhistory where bblx||civilregionalismid||reportdate in (select " +
                "distinct bblx||civilregionalismid||reportdate " +
                "from (select row_number () over (partition by t01.civilregionalismid,t01.bblx,t01.reportdate,t01.isvalide " +
                "                           order by t01.registerdate desc ,t01.state) rn,t01.* from hjcnhistory t01 where t01.isvalide='01') where rn = 2 and civilregionalismid is not null) " +
                "order by hjcnhistory.civilregionalismid,bblx,hjcnhistory.reportdate,hjcnhistory.registerdate,hjcnhistory.state";
        //List<HjcnHistoryNow> list = hisNowMapper.selfDefinedSQL(sql1);
        List<Map<String, Object>> list = hisNowMapper.selfDefinedSQL2(sql1);
        System.out.println(JSON.toJSONString(list.get(0)));
        int count=0;
        for (Map<String, Object> map:list){
            HjcnHistoryNow data = StringUtil.mapToObject(map, HjcnHistoryNow.class);
            if(!"01".equals(data.getIsvalide())){continue;}
            if("4".equals(data.getState()+"")){
                String tableName = getTableNameByBblxAndQylx(data.getBblx() + "", data.getQylx() + "");
                String sql2="select * from "+tableName+" where "+tableName+"id='"+data.getHistoryreportid()+"'";
                List<Map<String, Object>> list2 = hisNowMapper.selfDefinedSQL2(sql2);
                if(list2==null||list2.size()==0){
                    //System.err.println("×  "+JSON.toJSONString(data));
                    //String sql3 ="select * from hjcnhistory where path='"+data.getPath()+"' and id!='"+data.getId()+"'";
                    String sql3 ="select * from hjcnhistory where path='"+data.getPath()+"'";
                    List<Map<String, Object>> list3 = hisNowMapper.selfDefinedSQL2(sql3);
                    //System.err.println("其它相关错误记录【"+list3.size()+"】");
                    String sql4 ="select * from hjcnhistory where civilregionalismid='"+data.getCivilregionalismid()+"' and reportdate='"+data.getReportdate()+"' and bblx='"+data.getBblx()+"' and state='"+data.getState()+"' and isvalide='"+data.getIsvalide()+"'";
                    List<Map<String, Object>> map4 = hisNowMapper.selfDefinedSQL2(sql4);
                    System.err.println(map4.size()>1?"可删":"不可删");
                    list3.forEach(record -> System.err.println("×  "+JSON.toJSONString(record)));
//                    if (map4.size()>1) {
//                        list3.forEach(record -> hisNowMapper.deleteByPrimaryKey((String) record.get("ID")));
//                        System.err.println("完成删除【"+list3.size()+"】");
//                    }
                }else{
                    System.out.println(JSON.toJSONString(data));
                }
                count++;
            }
        }
        System.out.println("总数量【"+list.size()+"】   状态4可见数量【"+count+"】");
//        for (HjcnHistoryNow data:list) {
//            if(!"01".equals(data.getIsvalide())){continue;}
//            if("4".equals(data.getState()+"")){
//
//            }
//        }
    }

    private String getTableNameByBblxAndQylx(String bblx,String qylx){
        if("1".equals(qylx)){
            if("1".equals(bblx)){
                return "gtcb";
            }else if("2".equals(bblx)){
                return "gtyb";
            }else {
                return "gthb";
            }
        }else{
            if("1".equals(bblx)){
                return "mtcb";
            }else if("2".equals(bblx)){
                return "mtyb";
            }else {
                return "mthb";
            }
        }
    }
}
