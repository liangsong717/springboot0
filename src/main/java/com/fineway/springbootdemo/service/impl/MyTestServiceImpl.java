package com.fineway.springbootdemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.fineway.springbootdemo.dao.cnzb2016.mapper.Civilregionalism2016Mapper;
import com.fineway.springbootdemo.dao.cnzb2016.mapper.HistoryReportItemValueMapper;
import com.fineway.springbootdemo.dao.cnzb2016.mapper.Person2016Mapper;
import com.fineway.springbootdemo.dao.cnzb2016.mapper.SystemUser2016Mapper;
import com.fineway.springbootdemo.dao.cnzb2016.pojo.*;
import com.fineway.springbootdemo.dao.cnzb2017.mapper.*;
import com.fineway.springbootdemo.dao.cnzb2017.pojo.*;
import com.fineway.springbootdemo.dao.cnzb2018.mapper.CivilregionalismMapper;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.*;
import com.fineway.springbootdemo.dao.cnzb_kingbase.mapper.CivilregionalismKBMapper;
import com.fineway.springbootdemo.dao.cnzb_kingbase.mapper.MtcbKBMapper;
import com.fineway.springbootdemo.dao.cnzb_kingbase.mapper.MthbKBMapper;
import com.fineway.springbootdemo.dao.cnzb_kingbase.mapper.MtybKBMapper;
import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.CivilregionalismKB;
import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MtcbKB;
import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MthbKB;
import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MtybKB;
import com.fineway.springbootdemo.service.MyTestService;
import com.fineway.springbootdemo.utils.CharsetUtils;
import com.fineway.springbootdemo.utils.FieldsMapping;
import com.fineway.springbootdemo.utils.FileUtil;
import com.fineway.springbootdemo.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.*;

@Service
public class MyTestServiceImpl implements MyTestService {

    @Autowired
    private CivilregionalismMapper civiMapper;

    @Autowired
    private Civilregionalism2017Mapper civi2017Mapper;

    @Autowired
    private Civilregionalism2016Mapper civi2016Mapper;

    @Autowired
    private Person2016Mapper person2016Mapper;

    @Autowired
    private SystemUser2016Mapper user2016Mapper;

    @Autowired
    private Mthc2017Mapper mthc2017Mapper;

    @Autowired
    private HistoryReportItemValueMapper itemValueMapper;

    @Autowired
    private MtcbKBMapper mtcbKBMapper;

    @Autowired
    private MtybKBMapper mtybKBMapper;

    @Autowired
    private MthbKBMapper mthbKBMapper;

    @Autowired
    private CivilregionalismKBMapper civiKBMapper;

    @Autowired
    private HjcnHistory2017Mapper his2017Mapper;

    @Autowired
    private Gtcb2017Mapper gtcb2017Mapper;

    @Autowired
    private Gtyb2017Mapper gtyb2017Mapper;

    @Autowired
    private Mtcb2017Mapper mtcb2017Mapper;

    @Autowired
    private  Mtyb2017Mapper mtyb2017Mapper;

    @Autowired
    private Mthb2017Mapper mthb2017Mapper;

    @Autowired
    private Gthb2017Mapper gthb2017Mapper;

    @Autowired
    private Mtybjrqklx2017Mapper mtybjrqklx2017Mapper;

    @Autowired
    private Mthbjrqklx2017Mapper mthbjrqklx2017Mapper;

    @Autowired
    private  Gtybjrqklx2017Mapper gtybjrqklx2017Mapper;

    @Autowired
    private  Gthbjrqklx2017Mapper gthbjrqklx2017Mapper;

    @Autowired
    private Equipment2017Mapper equ2017Mapper;

    @Autowired
    private Relation2017Mapper relation2017Mapper;

    @Autowired
    private Person2017Mapper person2017Mapper;

    @Autowired
    private SystemUser2017Mapper user2017Mapper;

    @Override
    public void getCiviDatas() {
        List<Civilregionalism> datas = civiMapper.testSearch();
        for (Civilregionalism  oneData:datas) {
            System.out.println(JSON.toJSONString(oneData));
        }
    }

    @Override
    public void showCivi2017And2018() {
        System.out.println("------------------------------2018CIVI-----------------------------------");
        List<Civilregionalism> datas1 = civiMapper.searchByPage(1, 5);
        datas1.forEach(data -> System.out.println(JSON.toJSONString(data)));
        System.out.println("----------------------------------2017CIVI-------------------------------");
        List<Civilregionalism2017> datas2 = civi2017Mapper.searchByPage(1,5);
        datas2.forEach(data -> System.out.println(JSON.toJSONString(data)));
        System.out.println("----------------------------------2016CIVI-------------------------------");
        List<Civilregionalism2016> datas3 = civi2016Mapper.searchByPage(1,5);
        datas3.forEach(data -> System.out.println(JSON.toJSONString(data)));
    }

    @Override
    public void compareProvs2016And2017() {
        List<Civilregionalism2016> provs2016 = civi2016Mapper.selectProvs();
        System.out.println("-----2016省份条数："+(provs2016==null?0:provs2016.size()));
        List<Civilregionalism2017> provs2017 = civi2017Mapper.selectBy2016Datas(provs2016);
        if(provs2017!=null&&provs2017.size()>0){
            System.out.println("-----2017省份条数："+provs2017.size());
            provs2017.forEach(data -> System.out.println(JSON.toJSONString(data)));
        }else{
            System.out.println("未匹配到2017数据！");
        }
        List<Civilregionalism> provs2018 = civiMapper.selectBy2016Datas(provs2016);
        if(provs2018!=null&&provs2018.size()>0){
            System.out.println("-----2018省份条数："+provs2018.size());
            provs2018.forEach(data -> System.out.println(JSON.toJSONString(data)));
        }else{
            System.out.println("未匹配到2018数据！");
        }
    }

    /**
     * 此方法生成涉及用户3张表的SQL
     * @param companyType   2：钢铁    3：煤炭    null：全部
     * @param reportType    1：初报    2：续报    3：核报    null：全部
     */
    @Override
    public void moveCIVIDatas(String companyType, String reportType) {
        List<Civilregionalism> civiDatas=null;
        List<Civilregionalism> gtCiviDatas=null;
        List<Civilregionalism> mtCiviDatas=null;
        if(companyType==null){
            gtCiviDatas= civi2016Mapper.selectByChuBao4("2", reportType);
            mtCiviDatas=civi2016Mapper.selectByChuBao4("3", reportType);
            System.out.println("钢铁CIVI数据条数："+(gtCiviDatas==null?0:gtCiviDatas.size()));
            System.out.println("煤炭CIVI数据条数："+(mtCiviDatas==null?0:mtCiviDatas.size()));
            if(mtCiviDatas!=null&&mtCiviDatas.size()>0){
                List<CiviIdAndMkmc> mkmcs = mthc2017Mapper.selectCiviIdAndMkmc(null);
                if(mkmcs!=null&&mkmcs.size()>0){
                    Map<String,Object> map = new HashMap<>();
                    for (CiviIdAndMkmc mkmc:mkmcs) {
                        String qymc_trim = mkmc.getQymc().trim();
                        String mkmc_trim = mkmc.getTcmkmc().trim();
                        String[] mcs={qymc_trim, mkmc_trim};
                        int[] scoreQYMC = scoreQYMC(mcs);
                        if(scoreQYMC[0]<=5&&scoreQYMC[1]>5){
                            map.put(mkmc.getCivilregionalismid(), mkmc_trim);
                        }else if(scoreQYMC[1]<=5&&scoreQYMC[0]>5){
                            map.put(mkmc.getCivilregionalismid(), qymc_trim);
                        }else{
                            int qy_length=qymc_trim.length();
                            int mk_length=mkmc_trim.length();
                            if(qy_length>=mk_length){
                                if(((double)qy_length)/((double) mk_length)>=1.5){
                                    map.put(mkmc.getCivilregionalismid(), qymc_trim);
                                }else{
                                    if(scoreQYMC[0]>=scoreQYMC[1]-3){
                                        map.put(mkmc.getCivilregionalismid(), qymc_trim);
                                    }else{
                                        map.put(mkmc.getCivilregionalismid(), mkmc_trim);
                                    }
                                }
                            }else{
                                if(((double)mk_length)/((double) qy_length)>=1.5){
                                    map.put(mkmc.getCivilregionalismid(), mkmc_trim);
                                }else{
                                    if(scoreQYMC[1]>=scoreQYMC[0]-3){
                                        map.put(mkmc.getCivilregionalismid(), mkmc_trim);
                                    }else{
                                        map.put(mkmc.getCivilregionalismid(), qymc_trim);
                                    }
                                }
                            }
                        }
                        //map.put(mkmc.getCivilregionalismid(), mkmc_trim);
                    }
                    for (Civilregionalism mtCiviData:mtCiviDatas) {
                        String mc = (String) map.get(mtCiviData.getCivilregionalismid());
                        if(mc!=null){
                            mtCiviData.setCivilregionalismname(mc.replaceAll(" ",""));
                        }else{//查询初报 获取名称
                            List<ReportMsg> reportMsgs = itemValueMapper.searchReportMsg(mtCiviData.getCivilregionalismid(), "1", "退出煤矿名称");
                            if(reportMsgs==null||reportMsgs.size()==0){
                                mtCiviData.setCivilregionalismname(mtCiviData.getCivilregionalismname().replaceAll(" ",""));
                            }else if (reportMsgs.size()==1){
                                ReportMsg msg = reportMsgs.get(0);
                                String value = msg.getReportitemvalue();
                                if(value !=null&& value.trim().length()>msg.getCivilregionalismname().trim().length()){
                                    mtCiviData.setCivilregionalismname(value.replaceAll(" ",""));
                                }
                            }else{
                                FileUtil.writeErrorMsg("疑似脏数据："+JSON.toJSONString(reportMsgs));
                                String valueFinal="";
                                for (ReportMsg msg:reportMsgs) {
                                    String value = msg.getReportitemvalue();
                                    if(value !=null&&value.trim().length()>valueFinal.length()){
                                        valueFinal=value.trim();
                                    }
                                }
                                if(valueFinal.length()>mtCiviData.getCivilregionalismname().trim().length()){
                                    mtCiviData.setCivilregionalismname(valueFinal);
                                }
                            }
                        }
                    }
                }else {
                    //暂时不可能
                }
                if (gtCiviDatas!=null) {
                    for (Civilregionalism gtCivi:gtCiviDatas) {
                        gtCivi.setType("1");
                    }
                    mtCiviDatas.addAll(gtCiviDatas);
                }
                //System.out.println("数据条数：" + (civiDatas == null ? 0 : civiDatas.size()));
            }
        }else {//保证代码不走此处
            civiDatas = civi2016Mapper.selectByChuBao4(companyType, reportType);
            System.out.println("数据条数：" + (civiDatas == null ? 0 : civiDatas.size()));
        }
        List<Person2018> personDatas=person2016Mapper.selectByChuBao4_LeftJoinCivi(null,reportType);
        List<SystemUser2018> userDatas= user2016Mapper.selectByChuBao4_LeftJoinCivi(null,reportType);
        System.out.println("person记录：【"+(personDatas==null?0:personDatas.size())+"】");
        System.out.println("systemuser记录：【"+(userDatas==null?0:userDatas.size())+"】");
        String personSQL = StringUtil.createInsertSQL("PERSON", personDatas);
        String systemUserSQL = StringUtil.createInsertSQL("SYSTEMUSER", userDatas);

        FileUtil.writeStringToFile("G:/testSpace/cn2/person.sql",personSQL,false);
        FileUtil.writeStringToFile("G:/testSpace/cn2/systemuser.sql",systemUserSQL,false);

        String civiSQL = StringUtil.createInsertSQL("CIVILREGIONALISM", mtCiviDatas);
        FileUtil.writeStringToFile("G:/testSpace/cn2/civilregionalism.sql",civiSQL,false);
    }

    /**
     *     第一步：取数据
     *     第二步：字段映射
     *     第三步：实体类生成、赋值
     *     第四步：各实例类属性补充 格式修改 二次映射
     *     第五步：生成新SQL
     *     第六步：SQL写入文件
     * @param companyType
     * @param reportType
     */
    @Override
    public void moveC_Y_H_2016(String companyType, String reportType) {
        Date createtime = new Date();
        List<ReportDatas> gtcb = itemValueMapper.searchReportDatas("2", null, "1");
        List<ReportDatas> gtyb = itemValueMapper.searchReportDatas("2", null, "2");
        List<ReportDatas> gthb = itemValueMapper.searchReportDatas("2", null, "3");
        List<ReportDatas> mtcb = itemValueMapper.searchReportDatas("3", null, "1");
        List<ReportDatas> mtyb = itemValueMapper.searchReportDatas("3", null, "2");
        List<ReportDatas> mthb = itemValueMapper.searchReportDatas("3", null, "3");
        System.out.println("【钢铁初报】 数量【"+gtcb.size()+"】");
        System.out.println("【钢铁续报】 数量【"+gtyb.size()+"】");
        System.out.println("【钢铁核报】 数量【"+gthb.size()+"】");
        System.out.println("【煤炭初报】 数量【"+mtcb.size()+"】");
        System.out.println("【煤炭续报】 数量【"+mtyb.size()+"】");
        System.out.println("【煤炭核报】 数量【"+mthb.size()+"】");
        //create_gtcb(gtcb,createtime);
        //create_gtyb(gtyb,createtime);
        //create_gtyb_jr(gtyb,createtime);
        //create_gthb(gthb,createtime);
        //create_gthb_jr(gthb,createtime);
        //create_mtcb(mtcb,createtime);
        create_mtyb(mtyb,createtime);
        create_mtyb_jr(mtyb,createtime);
        create_mthb(mthb,createtime);
        create_mthb_jr(mthb,createtime);
    }

    @Override
    public void recoverTCMKMC() {
        int count1=0;
        List<MtcbKB> mtcbKBs = mtcbKBMapper.searchDataNoTCMKMC();
        if(mtcbKBs!=null){
            for (MtcbKB cb:mtcbKBs) {
                if(cb!=null&&cb.getCivilregionalismid()!=null){
                    CivilregionalismKB civilregionalismKB = civiKBMapper.selectByPrimaryKey(cb.getCivilregionalismid());
                    if(civilregionalismKB!=null){
                        //cb.setTcmkmc(civilregionalismKB.getCivilregionalismname());
                        int success = mtcbKBMapper.updateTCMKMCByID(cb.getMtcbid(), civilregionalismKB.getCivilregionalismname());
                        count1+=success;
                    }
                }
            }
        }
        int count2=0;
        List<MtybKB> mtybKBs = mtybKBMapper.searchDataNoTCMKMC();
        if(mtybKBs!=null){
            for (MtybKB yb:mtybKBs) {
                if(yb!=null&&yb.getCivilregionalismid()!=null){
                    CivilregionalismKB civilregionalismKB = civiKBMapper.selectByPrimaryKey(yb.getCivilregionalismid());
                    if(civilregionalismKB!=null){
                        //cb.setTcmkmc(civilregionalismKB.getCivilregionalismname());
                        int success = mtybKBMapper.updateTCMKMCByID(yb.getMtybid(), civilregionalismKB.getCivilregionalismname());
                        count2+=success;
                    }
                }
            }
        }
        int count3=0;
        List<MthbKB> mthbKBs = mthbKBMapper.searchDataNoTCMKMC();
        if(mthbKBs!=null){
            for (MthbKB hb:mthbKBs) {
                if(hb!=null&&hb.getCivilregionalismid()!=null){
                    CivilregionalismKB civilregionalismKB = civiKBMapper.selectByPrimaryKey(hb.getCivilregionalismid());
                    if(civilregionalismKB!=null){
                        //cb.setTcmkmc(civilregionalismKB.getCivilregionalismname());
                        int success = mthbKBMapper.updateTCMKMCByID(hb.getMthbid(), civilregionalismKB.getCivilregionalismname());
                        count3+=success;
                    }
                }
            }
        }
        System.out.println("【煤炭初报 无煤矿名称】数量【"+mtcbKBs.size()+"】 完成修复数量【"+count1+"】");
        System.out.println("【煤炭月报 无煤矿名称】数量【"+mtybKBs.size()+"】 完成修复数量【"+count2+"】");
        System.out.println("【煤炭核报 无煤矿名称】数量【"+mthbKBs.size()+"】 完成修复数量【"+count3+"】");
    }

    @Override
    public void showErrorDatas() {
        long t1 =System.currentTimeMillis();
        List<HjcnHistory2017> errorDatas = his2017Mapper.showErrorDatas();
        long t2 = System.currentTimeMillis();
        if(errorDatas!=null){
            errorDatas.forEach(data -> System.out.println(JSON.toJSONString(data)));
        }
        System.out.println("查询耗时【"+(t2-t1)+"】毫秒【2017历史记录表】【异常数据】条数【"+(errorDatas==null?0:errorDatas.size())+"】");
    }

    @Override
    public void getErrorCivis() {
        long t1 =System.currentTimeMillis();
        List<HjcnHistory2017> civis = his2017Mapper.getErrorCivis();
        System.out.println("存在多个可见状态的异常报表数：【"+(civis==null?0:civis.size())+"】");
        if(civis!=null&&civis.size()>0){
            for (HjcnHistory2017 data:civis) {
                List<HjcnHistory2017> fetchDatas = his2017Mapper.selectByCiviAndBblxAndReportdate(data);
                if(fetchDatas==null){continue;}
                List<String> ids= new ArrayList<>();
                if("4".equals(fetchDatas.get(0).getState()+"")){
                    for(int i=1;i<fetchDatas.size();i++){
                        //update操作
                        //fetchDatas.get(i).setIsvalide("02");
                        ids.add(fetchDatas.get(i).getId());
                        his2017Mapper.multUpdateIsvalide("02",ids);
                    }
                }else{
                    int mark4=0;
                    int mark5=0;
                    for(int i=1;i<fetchDatas.size();i++){
                        if(mark5==0&&"5".equals(fetchDatas.get(i).getState()+"")){
                            mark5=i;
                        }
                        if("4".equals(fetchDatas.get(i).getState()+"")){
                            mark4=i;
                            break;
                        }
                    }
                    System.out.println("状态4下标："+mark4+",状态5下标："+mark5);
                    if(mark4!=0){
                        for(int i=0;i<fetchDatas.size();i++){
                            if(i==mark4){continue;}
                            //update
                            //fetchDatas.get(i).setIsvalide("02");
                            ids.add(fetchDatas.get(i).getId());
                            his2017Mapper.multUpdateIsvalide("02",ids);
                        }
                    }else if(mark5!=0){
                        for(int i=0;i<fetchDatas.size();i++){
                            if(i==mark5){continue;}
                            //update
                            //fetchDatas.get(i).setIsvalide("02");
                            ids.add(fetchDatas.get(i).getId());
                            his2017Mapper.multUpdateIsvalide("02",ids);
                        }
                    }else{
                        for(int i=1;i<fetchDatas.size();i++){
                            //update
                            //fetchDatas.get(i).setIsvalide("02");
                            ids.add(fetchDatas.get(i).getId());
                            his2017Mapper.multUpdateIsvalide("02",ids);
                        }
                    }
                }
                System.out.println("*");
            }
        }
        long t2 = System.currentTimeMillis();
    }

    @Override
    public void dualHistoryreportid() {
        String sql_gtcb="select * from hjcnhistory t01 left join gtcb t02 on t01.historyreportid=t02.gtcbid " +
                "where t01.civilregionalismid is not null and t01.bblx='1' and t01.state='4' and t01.qylx='1' and t02.gtcbid is null";
        String sql_gtyb="select * from hjcnhistory t01 left join gtyb t02 on t01.historyreportid=t02.gtybid " +
                "where t01.civilregionalismid is not null and t01.bblx='2' and t01.state='4' and t01.qylx='1' and t02.gtybid is null";
        String sql_gthb="select * from hjcnhistory t01 left join gthb t02 on t01.historyreportid=t02.gthbid " +
                "where t01.civilregionalismid is not null and t01.bblx='3' and t01.state='4' and t01.qylx='1' and t02.gthbid is null";

        String sql_mtcb="select * from hjcnhistory t01 left join mtcb t02 on t01.historyreportid=t02.mtcbid " +
                "where t01.civilregionalismid is not null and t01.bblx='1' and t01.state='4' and t01.qylx='2' and t02.mtcbid is null";
        String sql_mtyb="select * from hjcnhistory t01 left join mtyb t02 on t01.historyreportid=t02.mtybid " +
                "where t01.civilregionalismid is not null and t01.bblx='2' and t01.state='4' and t01.qylx='2' and t02.mtybid is null";
        String sql_mthb="select * from hjcnhistory t01 left join mthb t02 on t01.historyreportid=t02.mthbid " +
                "where t01.civilregionalismid is not null and t01.bblx='3' and t01.state='4' and t01.qylx='2' and t02.mthbid is null";

        List<HjcnHistory2017> gtcbError = his2017Mapper.selfDefinedSQL(sql_gtcb);
        List<HjcnHistory2017> gtybError = his2017Mapper.selfDefinedSQL(sql_gtyb);
        List<HjcnHistory2017> gthbError = his2017Mapper.selfDefinedSQL(sql_gthb);

        List<HjcnHistory2017> mtcbError = his2017Mapper.selfDefinedSQL(sql_mtcb);
        List<HjcnHistory2017> mtybError = his2017Mapper.selfDefinedSQL(sql_mtyb);
        List<HjcnHistory2017> mthbError = his2017Mapper.selfDefinedSQL(sql_mthb);

        //mtybError.forEach(data -> System.out.println(data.getCivilregionalismid()+" "+data.getReportdate()));
        System.out.println("【钢铁】  初报:"+gtcbError.size()+"  月报:"+gtybError.size()+"  核报"+gthbError.size());
        System.out.println("【煤炭】  初报:"+mtcbError.size()+"  月报:"+mtybError.size()+"  核报"+mthbError.size());

        String sql_cyh="select * from <%table%> where civilregionalismid = '<%区划ID%>' and reporttime='<%报告月%>' order by createtime desc";

        int count_gtc=0;
        int count_gty=0;
        int count_mtc=0;
        int count_mty=0;
        for (HjcnHistory2017 gtcbHis:gtcbError) {
            String gtc = sql_cyh.replaceAll("<%table%>","gtcb");
            gtc=gtc.replaceAll("<%区划ID%>",gtcbHis.getCivilregionalismid());
            gtc=gtc.replaceAll("<%报告月%>",gtcbHis.getReportdate());
            List<Gtcb2017> gtcb2017s = gtcb2017Mapper.selfDefinedSQL(gtc);
            if(gtcb2017s==null||gtcb2017s.size()==0){continue;}
            HjcnHistory2017 record = new HjcnHistory2017();
            record.setId(gtcbHis.getId());
            record.setHistoryreportid(gtcb2017s.get(0).getGtcbid());
            count_gtc += his2017Mapper.updateByPrimaryKeySelective(record);
        }
        for (HjcnHistory2017 gtybHis:gtybError) {
            String gty = sql_cyh.replaceAll("<%table%>","gtyb");
            gty=gty.replaceAll("<%区划ID%>",gtybHis.getCivilregionalismid());
            gty=gty.replaceAll("<%报告月%>",gtybHis.getReportdate());
            List<Gtyb2017> gtyb2017s = gtyb2017Mapper.selfDefinedSQL(gty);
            if(gtyb2017s==null||gtyb2017s.size()==0){continue;}
            HjcnHistory2017 record = new HjcnHistory2017();
            record.setId(gtybHis.getId());
            record.setHistoryreportid(gtyb2017s.get(0).getGtybid());
            count_gty +=his2017Mapper.updateByPrimaryKeySelective(record);
        }
        for (HjcnHistory2017 mtcbHis:mtcbError) {
            String mtc = sql_cyh.replaceAll("<%table%>","mtcb");
            mtc=mtc.replaceAll("<%区划ID%>",mtcbHis.getCivilregionalismid());
            mtc=mtc.replaceAll("<%报告月%>",mtcbHis.getReportdate());
            List<Mtcb2017> mtcb2017s = mtcb2017Mapper.selfDefinedSQL(mtc);
            if(mtcb2017s==null||mtcb2017s.size()==0){continue;}
            HjcnHistory2017 record = new HjcnHistory2017();
            record.setId(mtcbHis.getId());
            record.setHistoryreportid(mtcb2017s.get(0).getMtcbid());
            count_mtc +=his2017Mapper.updateByPrimaryKeySelective(record);
        }
        for (HjcnHistory2017 mtybHis:mtybError) {
            String mty = sql_cyh.replaceAll("<%table%>","mtyb");
            mty=mty.replaceAll("<%区划ID%>",mtybHis.getCivilregionalismid());
            mty=mty.replaceAll("<%报告月%>",mtybHis.getReportdate());
            List<Mtyb2017> mtyb2017s = mtyb2017Mapper.selfDefinedSQL(mty);
            if(mtyb2017s==null||mtyb2017s.size()==0){continue;}
            HjcnHistory2017 record = new HjcnHistory2017();
            record.setId(mtybHis.getId());
            record.setHistoryreportid(mtyb2017s.get(0).getMtybid());
            count_mty +=his2017Mapper.updateByPrimaryKeySelective(record);
        }
        System.out.println("钢铁初报【"+count_gtc+"】  钢铁月报【"+count_gty+"】  煤炭初报【"+count_mtc+"】  煤炭月报【"+count_mty+"】");
    }

    /**
     * 2017数据迁移方法
     */
    @Override
    public void gerMoveDatasSQL() {
        List<Civilregionalism> civi2017 = civi2017Mapper.getMoveDatas();
        List<Person2017> person2017 = person2017Mapper.getMoveDatas();
        List<SystemUser2017> user2017 = user2017Mapper.getMoveDatas();
        List<HjcnHistory2017> his2017 = his2017Mapper.getMoveDatas();
        List<Gtcb2017> gtcb2017 = gtcb2017Mapper.getMoveDatas();
        List<Gtyb2017> gtyb2017 = gtyb2017Mapper.getMoveDatas();
        List<Gthb2017> gthb2017 = gthb2017Mapper.getMoveDatas();
        List<Gtybjrqklx2017> gtybjrqklx2017 = gtybjrqklx2017Mapper.getMoveDatas();
        List<Gthbjrqklx2017> gthbjrqklx2017 = gthbjrqklx2017Mapper.getMoveDatas();
        List<Mtcb2017> mtcb2017 = mtcb2017Mapper.getMoveDatas();
        List<Mtyb2017> mtyb2017 = mtyb2017Mapper.getMoveDatas();
        List<Mthb2017> mthb2017 = mthb2017Mapper.getMoveDatas();
        List<Mtybjrqklx2017> mtybjrqklx2017 = mtybjrqklx2017Mapper.getMoveDatas();
        List<Mthbjrqklx2017> mthbjrqklx2017 = mthbjrqklx2017Mapper.getMoveDatas();
        List<Equipment2017> equ2017 = equ2017Mapper.getMoveData();
        List<Relation2017> relationData = relation2017Mapper.getMoveData();
        System.out.println("企业数量【"+civi2017.size()+"】");
        System.out.println("person表数量【"+person2017.size()+"】");
        System.out.println("user表数量【"+user2017.size()+"】");
        System.out.println("历史记录数量【"+his2017.size()+"】");
        System.out.println("设备表数量【"+equ2017.size()+"】");
        System.out.println("关系表数量【"+relationData.size()+"】");
        System.out.println("【钢铁】  初报:"+gtcb2017.size()+"  月报:"+gtyb2017.size()+"  月报金融:"+gtybjrqklx2017.size()
                +"  核报:"+gthb2017.size()+"  核报金融:"+gthbjrqklx2017.size());
        System.out.println("【煤炭】  初报:"+mtcb2017.size()+"  月报:"+mtyb2017.size()+"  月报金融:"+mtybjrqklx2017.size()
                +"  核报:"+mthb2017.size()+"  核报金融:"+mthbjrqklx2017.size());
        //
        for (Civilregionalism civi:civi2017) {
            if (civi.getCivilregionalismid().startsWith("HJCN")&&civi.getCivilregionalismid().endsWith("1")&&civi.getParentid()!=null){
                civi.setType("1");
            }
            if(civi.getCivilregionalismshortname().contains("？")||civi.getCivilregionalismshortname().length()>civi.getCivilregionalismname().length()){
                civi.setCivilregionalismshortname(civi.getCivilregionalismname());
            }
        }
        for (Gtcb2017 gtcb:gtcb2017) {
            if(gtcb.getZzjgdm().startsWith("%")){
                gtcb.setZzjgdm(StringUtil.doubleDecode(gtcb.getZzjgdm()));
            }
            if(gtcb.getXydm().startsWith("%")){
                gtcb.setXydm(StringUtil.doubleDecode(gtcb.getXydm()));
            }
        }
        for (Gtyb2017 gtyb:gtyb2017) {
            if(gtyb.getZzjgdm().startsWith("%")){
                gtyb.setZzjgdm(StringUtil.doubleDecode(gtyb.getZzjgdm()));
            }
            if(gtyb.getXydm().startsWith("%")){
                gtyb.setXydm(StringUtil.doubleDecode(gtyb.getXydm()));
            }
        }
        for (Gthb2017 gthb:gthb2017) {
            if(gthb.getZcczqk()!=null&&gthb.getZcczqk().startsWith("%")){
                gthb.setZcczqk(StringUtil.doubleDecode(gthb.getZcczqk()));
            }
            if(gthb.getYccsbxhjsl()!=null&&gthb.getYccsbxhjsl().startsWith("%")){
                gthb.setYccsbxhjsl(StringUtil.doubleDecode(gthb.getYccsbxhjsl()));
            }
            if(gthb.getWccsbxhjsl()!=null&&gthb.getWccsbxhjsl().startsWith("%")){
                gthb.setWccsbxhjsl(StringUtil.doubleDecode(gthb.getWccsbxhjsl()));
            }
        }
        for (Mtcb2017 mtcb:mtcb2017) {
            if(mtcb.getZzjgdm().startsWith("%")){
                mtcb.setZzjgdm(StringUtil.doubleDecode(mtcb.getZzjgdm()));
            }
            if(mtcb.getXydm().startsWith("%")){
                mtcb.setXydm(StringUtil.doubleDecode(mtcb.getXydm()));
            }
        }
        for (Mtyb2017 mtyb:mtyb2017) {
            if(mtyb.getZzjgdm()!=null&&mtyb.getZzjgdm().startsWith("%")){
                mtyb.setZzjgdm(StringUtil.doubleDecode(mtyb.getZzjgdm()));
            }
            if(mtyb.getXydm()!=null&&mtyb.getXydm().startsWith("%")){
                mtyb.setXydm(StringUtil.doubleDecode(mtyb.getXydm()));
            }
        }
        for (Mthb2017 mthb:mthb2017) {
            if(mthb.getZzjgdm()!=null&&mthb.getZzjgdm().startsWith("%")){
                mthb.setZzjgdm(StringUtil.doubleDecode(mthb.getZzjgdm()));
            }
            if(mthb.getXydm()!=null&&mthb.getXydm().startsWith("%")){
                mthb.setXydm(StringUtil.doubleDecode(mthb.getXydm()));
            }
            if(mthb.getJksffb()!=null&&mthb.getJksffb().startsWith("%")){
                mthb.setJksffb(StringUtil.doubleDecode(mthb.getJksffb()));
            }
            if(mthb.getZjsfzx()!=null&&mthb.getZjsfzx().startsWith("%")){
                mthb.setZjsfzx(StringUtil.doubleDecode(mthb.getZjsfzx()));
            }
            if(mthb.getSfys1()!=null&&mthb.getSfys1().startsWith("%")){
                mthb.setSfys1(StringUtil.doubleDecode(mthb.getSfys1()));
            }
        }
        //
        //String civi_SQL = StringUtil.createInsertSQL("CIVILREGIONALISM", civi2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/civilregionalism.sql",civi_SQL,false);
        String person_SQL = StringUtil.createInsertSQL("PERSON", person2017);
        FileUtil.writeStringToFile("G:/testSpace/cn2017/person.sql",person_SQL,false);
        String systemuser_SQL = StringUtil.createInsertSQL("SYSTEMUSER", user2017);
        FileUtil.writeStringToFile("G:/testSpace/cn2017/SYSTEMUSER.sql",systemuser_SQL,false);

        //String his_SQL = StringUtil.createInsertSQL("HJCNHISTORY", his2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/hjcnhistory.sql",his_SQL,false);
        //String equ_SQL = StringUtil.createInsertSQL("EQUIPMENT",equ2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/equipment.sql",equ_SQL,false);
        //String relation_SQL = StringUtil.createInsertSQL("RELATION", relationData);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/relation.sql",relation_SQL,false);

        //String gtcb_SQL=StringUtil.createInsertSQL("GTCB",gtcb2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/gtcb.sql",gtcb_SQL,false);
        //String gtyb_SQL=StringUtil.createInsertSQL("GTYB",gtyb2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/gtyb.sql",gtyb_SQL,false);
        //String gthb_SQL=StringUtil.createInsertSQL("GTHB",gthb2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/gthb.sql",gthb_SQL,false);

        //String mtcb_SQL=StringUtil.createInsertSQL("MTCB",mtcb2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/mtcb.sql",mtcb_SQL,false);
        //String mtyb_SQL=StringUtil.createInsertSQL("MTYB",mtyb2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/mtyb.sql",mtyb_SQL,false);
        //String mthb_SQL=StringUtil.createInsertSQL("MTHB",mthb2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/mthb.sql",mthb_SQL,false);

        //String gtyb_jr_SQL =StringUtil.createInsertSQL("GTYBJRQKLX",gtybjrqklx2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/gtybjrqklx.sql",gtyb_jr_SQL,false);
        //String gthb_jr_SQL=StringUtil.createInsertSQL("GTHBJRQKLX",gthbjrqklx2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/gthbjrqklx.sql",gthb_jr_SQL,false);
        //String mtyb_jr_SQL=StringUtil.createInsertSQL("MTYBJRQKLX",mtybjrqklx2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/mtybjrqklx.sql",mtyb_jr_SQL,false);
        //String mthb_jr_SQL=StringUtil.createInsertSQL("MTHBJRQKLX",mthbjrqklx2017);
        //FileUtil.writeStringToFile("G:/testSpace/cn2017/mthbjrqklx.sql",mthb_jr_SQL,false);
    }

    @Override
    public void decodeStr() {
        Equipment2017 equ = equ2017Mapper.selectByPrimaryKey("42390297EDD54EE4A2C128C3C1CB3376");
        if(equ==null){return;}
        try {
            System.out.println(equ.getEquipmentname());
            //System.out.println(CharsetUtils.getEncode(equ.getEquipmentname()));
            System.out.println(CharsetUtils.changeCharset(equ.getEquipmentname(),"gb18030"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("=============分割线===========");
        List<EquipmentAndJsonPath> paths = equ2017Mapper.getJsonPath();
        if(paths==null){return;}
        int count=0;
        int defaultCount=0;
        int successCount=0;
        int finished=0;
        Map<String,Object> map;
        for (EquipmentAndJsonPath data:paths) {
            String equipmentname = data.getEquipmentname();
            String reg = "^[0-9]*$";
            if(!equipmentname.contains("炉")&&!equipmentname.matches("^[0-9]*[Tt]{0,1}$")&&!"无".equals(equipmentname)&&!equipmentname.contains("吨")
            &&!equipmentname.endsWith("立方米")&&!equipmentname.matches("^[0-9]*[\u4e00-\u9fa5]*$")){
            //if(!equipmentname.contains("炉")&&!"0".equals(equipmentname)&&!"无".equals(equipmentname)){
                count++;
                String jsonStr = FileUtil.getStringFromJSONFile("D:" + data.getPath(), "gb18030");
                if(jsonStr==null){
                    defaultCount++;
                    continue;
                }else{
                    successCount++;
                }
                map= (Map<String, Object>) JSON.parse(jsonStr);
                Map<String, Object> subMap=(Map<String, Object>)JSON.parse((String) map.get("data"));
                if(subMap==null){
                    System.out.println("PATH:【"+data.getPath()+"】  NO DATA!");
                    continue;
                }
                List<Object> lgzb = (List<Object>) subMap.get("lgjhtczb");
                List<Object> ltzb = (List<Object>) subMap.get("jhtczbxhjsl");
                if(lgzb==null&&ltzb==null){
                    lgzb = (List<Object>) subMap.get("lgbytczb");
                    ltzb = (List<Object>) subMap.get("ltbytczb");
                    if (lgzb==null&&ltzb==null) {
                        System.out.println("PATH:【"+data.getPath()+"】  ID:【"+map.get("reportid")+"】\t\t无设备信息");
                        continue;
                    }
                }
                System.out.println(equipmentname);
                System.out.print("PATH:【"+data.getPath()+"】  ID:【"+map.get("reportid")+"】\t\t炼钢装备:"+JSON.toJSONString(lgzb));
                System.out.println("\t\t退出装备数量:"+JSON.toJSONString(ltzb));
                Map<String,Object> lg_equipmentMap = (Map<String, Object>) lgzb.get(0);
                Map<String,Object> lt_equipmentMap = (Map<String, Object>) ltzb.get(0);
                String equipmentnameTemp= (String) lg_equipmentMap.get("equipmentname");
                if(equipmentname.substring(0,1).equals(equipmentnameTemp.substring(0,1))){
                    System.out.println("乱码修改【"+equipmentnameTemp+"】");
                }else {
                    equipmentnameTemp=(String) lt_equipmentMap.get("equipmentname");
                    System.out.println("乱码修改【"+(String) lt_equipmentMap.get("equipmentname")+"】");
                }
                //finished += equ2017Mapper.updateByPrimaryKeySelective(new Equipment2017(data.getEquipmentid(), equipmentnameTemp, null, null, null));
            }
        }
        System.out.println("\n匹配equipment表总数量【"+paths.size()+"】 异常数据数量【"+count+"】  成功匹配文件【"+successCount+"】  未匹配到json文件数量【"+defaultCount+"】  完成修改【"+finished+"】");
    }

    private void create_mthb_jr(List<ReportDatas> mthb, Date createtime) {
        List<Mthbjrqklx> mthb_jr_temp=new ArrayList<>();
        for (ReportDatas data:mthb) {
            Mthbjrqklx temp = FieldsMapping.reflactSetProperties(new Mthbjrqklx(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setName(FieldsMapping.nameMapping2016T02018(temp.getName(),2));
            if(temp.getName()==null){continue;}
            temp.setMthbjrqklxid(StringUtil.getUUID32());
            temp.setCreatetime(createtime);
            temp.setModifytime(createtime);
            temp.setReportid(data.getReportid());
            temp.setSjje(FieldsMapping.dualNullTo0(temp.getSjje()));
            temp.setSjjrjgmc(FieldsMapping.dualNullToWU(temp.getSjjrjgmc()));
            temp.setQkms(FieldsMapping.dualNullToWU(temp.getQkms()));
            temp.setSfxdfjrjgfy(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getSfxdfjrjgfy())));
            temp.setDfjrjghfyj(FieldsMapping.dualNullToWU(temp.getDfjrjghfyj()));
            mthb_jr_temp.add(temp);
        }
        String mthb_jr_SQL = StringUtil.createInsertSQL("MTHBJRQKLX", mthb_jr_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/mthbjrqklx.sql",mthb_jr_SQL,false);
    }

    private void create_mtyb_jr(List<ReportDatas> mtyb, Date createtime) {
        List<Mtybjrqklx> mtyb_jr_temp=new ArrayList<>();
        for (ReportDatas data:mtyb) {
            Mtybjrqklx temp = FieldsMapping.reflactSetProperties(new Mtybjrqklx(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setName(FieldsMapping.nameMapping2016T02018(temp.getName(),2));
            if(temp.getName()==null){continue;}
            temp.setMtybjrqklxid(StringUtil.getUUID32());
            temp.setCreatetime(createtime);
            temp.setModifytime(createtime);
            temp.setReportid(data.getReportid());
            temp.setSjje(FieldsMapping.dualNullTo0(temp.getSjje()));
            temp.setSjjrjgmc(FieldsMapping.dualNullToWU(temp.getSjjrjgmc()));
            temp.setSfxdfjrjgfy(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getSfxdfjrjgfy())));
            temp.setDfjrjghfyj(FieldsMapping.dualNullToWU(temp.getDfjrjghfyj()));
            temp.setQysq(FieldsMapping.dualNullToWU(temp.getQysq()));
            temp.setQkms(FieldsMapping.dualNullToWU(temp.getQkms()));
            mtyb_jr_temp.add(temp);
        }
        String mtyb_jr_SQL = StringUtil.createInsertSQL("MTYBJRQKLX", mtyb_jr_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/mtybjrqklx.sql",mtyb_jr_SQL,false);
    }

    private void create_gthb_jr(List<ReportDatas> gthb, Date createtime) {
        List<Gthbjrqklx> gthb_jr_temp=new ArrayList<>();
        for (ReportDatas data:gthb) {
            Gthbjrqklx temp = FieldsMapping.reflactSetProperties(new Gthbjrqklx(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setName(FieldsMapping.nameMapping2016T02018(temp.getName(),1));
            if(temp.getName()==null){continue;}
            temp.setGthbjrqklxid(StringUtil.getUUID32());
            temp.setCreatetime(createtime);
            temp.setModifytime(createtime);
            temp.setReportid(data.getReportid());
            temp.setSjje(FieldsMapping.dualNullTo0(temp.getSjje()));
            temp.setSjjrjgmc(FieldsMapping.dualNullToWU(temp.getSjjrjgmc()));
            gthb_jr_temp.add(temp);
        }
        String gthb_jr_SQL = StringUtil.createInsertSQL("GTHBJRQKLX", gthb_jr_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/gthbjrqklx.sql",gthb_jr_SQL,false);
    }

    private void create_gtyb_jr(List<ReportDatas> gtyb, Date createtime) {
        List<Gtybjrqklx> gtyb_jr_temp=new ArrayList<>();
        for (ReportDatas data:gtyb) {
            Gtybjrqklx temp = FieldsMapping.reflactSetProperties(new Gtybjrqklx(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setName(FieldsMapping.nameMapping2016T02018(temp.getName(),1));
            if(temp.getName()==null){continue;}
            temp.setGtybjrqklxid(StringUtil.getUUID32());
            temp.setCreatetime(createtime);
            temp.setModifytime(createtime);
            temp.setReportid(data.getReportid());
            temp.setSfxdfjrjgfy(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getSfxdfjrjgfy())));
            temp.setSjje(FieldsMapping.dualNullTo0(temp.getSjje()));
            temp.setSjjrjgmc(FieldsMapping.dualNullToWU(temp.getSjjrjgmc()));
            gtyb_jr_temp.add(temp);
        }
        String gtyb_jr_SQL = StringUtil.createInsertSQL("GTYBJRQKLX", gtyb_jr_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/gtybjrqklx.sql",gtyb_jr_SQL,false);
    }

    private void create_mthb(List<ReportDatas> mthb, Date createtime) {
        //
        List<MthbStr> mthb_temp=new ArrayList<>();
        for (ReportDatas data:mthb) {
            MthbStr temp = FieldsMapping.reflactSetProperties(new MthbStr(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setMthbid(data.getReportid());
            temp.setCivilregionalismid(data.getCivilregionalismid());
            temp.setReporttime(StringUtil.getEarlyMonth(StringUtil.getYearAndMonth(data.getReporttime())));
            temp.setCreatetime(createtime);
            temp.setShzt("4");
            temp.setSftc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getSftc())));
            //temp.setZzjgdm(FieldsMapping.dualNullToWU(temp.getZzjgdm()));
            //temp.setXydm(FieldsMapping.dualNullToWU(temp.getXydm()));
            temp.setZcczqk(FieldsMapping.dualNullToWU(temp.getZcczqk()));
            mthb_temp.add(temp);
        }
        String mthb_SQL = StringUtil.createInsertSQL("MTHB", mthb_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/mthb.sql",mthb_SQL,false);
    }

    private void create_mtyb(List<ReportDatas> mtyb, Date createtime) {
        //
        List<MtybStr> mtyb_temp=new ArrayList<>();
        for (ReportDatas data:mtyb) {
            MtybStr temp = FieldsMapping.reflactSetProperties(new MtybStr(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setMtybid(data.getReportid());
            temp.setCivilregionalismid(data.getCivilregionalismid());
            temp.setReporttime(StringUtil.getEarlyMonth(StringUtil.getYearAndMonth(data.getReporttime())));
            temp.setCreatetime(createtime);
            temp.setShzt("4");
            temp.setZzjgdm(FieldsMapping.dualNotNumToNull(temp.getZzjgdm()));
            temp.setSftc(StringUtil.YNToTrueFalse(temp.getSftc()));
            temp.setSfys1(StringUtil.YNToTrueFalse(temp.getSfys1()));
            mtyb_temp.add(temp);
        }
        String mtyb_SQL = StringUtil.createInsertSQL("MTYB", mtyb_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/mtyb.sql",mtyb_SQL,false);
    }

    private void create_mtcb(List<ReportDatas> mtcb, Date createtime) {
        //
        List<MtcbStr> mtcb_temp=new ArrayList<>();
        for (ReportDatas data:mtcb) {
            MtcbStr temp = FieldsMapping.reflactSetProperties(new MtcbStr(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setMtcbid(data.getReportid());
            temp.setCivilregionalismid(data.getCivilregionalismid());
            temp.setReporttime(StringUtil.getEarlyMonth(StringUtil.getYearAndMonth(data.getReporttime())));
            temp.setCreatetime(createtime);
            temp.setShzt("4");
            temp.setZzjgdm(FieldsMapping.dualNotNumToWU(temp.getZzjgdm()));
            mtcb_temp.add(temp);
        }
        String mtcb_SQL = StringUtil.createInsertSQL("MTCB", mtcb_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/mtcb.sql",mtcb_SQL,false);
    }

    private void create_gthb(List<ReportDatas> gthb, Date createtime) {
        //
        List<GthbStr> gthb_temp=new ArrayList<>();
        for (ReportDatas data:gthb) {
            GthbStr temp = FieldsMapping.reflactSetProperties(new GthbStr(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setGthbid(data.getReportid());
            temp.setCivilregionalismid(data.getCivilregionalismid());
            temp.setReporttime(StringUtil.getEarlyMonth(StringUtil.getYearAndMonth(data.getReporttime())));
            temp.setCreatetime(createtime);
            temp.setShzt("4");
            temp.setLtsftc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getLtsftc())));
            temp.setLgsftc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getLgsftc())));
            temp.setQysfzttc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getQysfzttc())));
            temp.setYccsbsfcdbc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getYccsbsfcdbc())));
            temp.setYccsbsfys(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getYccsbsfys())));
            temp.setWccsbsfgs(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getWccsbsfgs())));
            temp.setWccsbsfys(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getWccsbsfys())));
            temp.setZfwzsfgs(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getZfwzsfgs())));
            gthb_temp.add(temp);
        }
        String gthb_SQL = StringUtil.createInsertSQL("GTHB", gthb_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/gthb.sql",gthb_SQL,false);
    }

    private void create_gtyb(List<ReportDatas> gtyb, Date createtime) {
        //
        List<GtybStr> gtyb_temp=new ArrayList<>();
        for (ReportDatas data:gtyb) {
            GtybStr temp = FieldsMapping.reflactSetProperties(new GtybStr(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setGtybid(data.getReportid());
            temp.setCivilregionalismid(data.getCivilregionalismid());
            temp.setReporttime(StringUtil.getEarlyMonth(StringUtil.getYearAndMonth(data.getReporttime())));
            temp.setCreatetime(createtime);
            temp.setShzt("4");
            temp.setLtbysftc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getLtbysftc())));
            temp.setLgbysftc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getLgbysftc())));
            temp.setYccsbsfcdbc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getYccsbsfcdbc())));
            temp.setYccsbsfys(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getYccsbsfys())));
            temp.setWccsbsfgs(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getWccsbsfgs())));
            temp.setWccsbsfys(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getWccsbsfys())));
            temp.setZfwzsfgs(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getZfwzsfgs())));
            temp.setZzjgdm(FieldsMapping.dualNotNumToNull(temp.getZzjgdm()));
            gtyb_temp.add(temp);
        }
        String gtyb_SQL = StringUtil.createInsertSQL("GTYB", gtyb_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/gtyb.sql",gtyb_SQL,false);
    }

    private void create_gtcb(List<ReportDatas> gtcb,Date createtime) {
        //钢铁初报
        List<GtcbStr> gtcb_temp=new ArrayList<>();
        for (ReportDatas data:gtcb) {
            GtcbStr temp = FieldsMapping.reflactSetProperties(new GtcbStr(), FieldsMapping.mapping2016To2018(data.getCodes()), data.getDatas());
            if(temp==null){continue;}
            temp.setGtcbid(data.getReportid());
            temp.setCivilregionalismid(data.getCivilregionalismid());
            temp.setReporttime(StringUtil.getEarlyMonth(StringUtil.getYearAndMonth(data.getReporttime())));
            temp.setCreatetime(createtime);
            temp.setShzt("4");
            temp.setQysfzttc(FieldsMapping.dualNullToFalse(StringUtil.YNToTrueFalse(temp.getQysfzttc())));
            temp.setLtjhtcsj(StringUtil.replaceAToBAndFormat(temp.getLtjhtcsj(),"[.年月日]","-"));
            temp.setLgjhtcsj(StringUtil.replaceAToBAndFormat(temp.getLgjhtcsj(),"[.年月日]","-"));
            temp.setZzjgdm(FieldsMapping.dualNotNumToNull(temp.getZzjgdm()));
            gtcb_temp.add(temp);
        }
        String gtcb_SQL = StringUtil.createInsertSQL("GTCB", gtcb_temp);
        FileUtil.writeStringToFile("G:/testSpace/cn2/gtcb.sql",gtcb_SQL,false);
    }


    private int[] scoreQYMC(String[] qymc){
        if(qymc==null||qymc.length==0){return null;}
        int baseNum=10;
        int[] scores = new int[qymc.length];
        for (int i =0;i<qymc.length;i++){
            String mc = qymc[i].replaceAll(" ", "");
            int num=baseNum;
            if(mc.startsWith("其中：")||mc.startsWith("其中:")){
                num=num-3;
            }
            if(mc.contains("\"")){
                num=num-1;
            }
            if(!mc.contains("煤")&&!mc.contains("矿")&&!mc.contains("公司")&&mc.contains("井")){
                num=num-5;
            }
            if("退出".equals(mc)||"0".equals(mc)||"".equals(mc)){
                num=0;
            }
            scores[i]=num;
        }
        return scores;
    }
}
