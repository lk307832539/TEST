package com.lk.util;

import com.lk.entity.Inventory;
import com.lk.service.InventoryService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Component
public class InventoryReadUtil {
    @Resource
    private InventoryService service;

    private static int threadNum = 10;

    public void readFile() throws Exception {
        //指定读取文件所在位置
        File file = new File("C:/Users/z003xp9h/Desktop/Inventory_mvt_dailydown.txt");
        FileChannel fileChannel = new RandomAccessFile(file, "r").getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(300);
        //使用temp字节数组用于存储不完整的行的内容
        byte[] temp = new byte[0];


//        file.getTotalSpace()

        long startTime = System.currentTimeMillis();
        long runTime = System.currentTimeMillis();
        int count = 0;

        CountDownLatch threadSignal = new CountDownLatch(threadNum);
        List<Inventory> list = new ArrayList<>();

        while (fileChannel.read(byteBuffer) != -1) {
            byte[] bs = new byte[byteBuffer.position()];
            byteBuffer.flip();
            byteBuffer.get(bs);
            byteBuffer.clear();
            int startNum = 0;
            //判断是否出现了换行符，注意这要区分LF-\n,CR-\r,CRLF-\r\n,这里判断\n
            boolean isNewLine = false;
            for (int i = 0; i < bs.length; i++) {
                if (bs[i] == 10) {
                    isNewLine = true;
                    startNum = i;
                }
            }

            if (isNewLine) {
                //如果出现了换行符，将temp中的内容与换行符之前的内容拼接
                byte[] toTemp = new byte[temp.length + startNum];
                System.arraycopy(temp, 0, toTemp, 0, temp.length);
                System.arraycopy(bs, 0, toTemp, temp.length, startNum);

                if (count >= 1) {
                    list.add(addInventory(new String(toTemp)));
                }

                if (count > 1 && count % 1000 == 0) {

                    new InventorySaveThread(service, new ArrayList<>(list), threadSignal).start();

                    System.out.println("运行时间：" + (System.currentTimeMillis() - runTime) + " 行数：" + count);
                    runTime = System.currentTimeMillis();

                    if (threadSignal.getCount() == 8) {
                        threadSignal.await(15, TimeUnit.SECONDS);
                    }

                    list.clear();
                }
                count++;

                //将换行符之后的内容(去除换行符)存到temp中
                temp = new byte[bs.length - startNum - 1];
                System.arraycopy(bs, startNum + 1, temp, 0, bs.length - startNum - 1);
                //使用return即为单行读取，不打开即为全部读取
                //return;
            } else {
                //如果没出现换行符，则将内容保存到temp中
                byte[] toTemp = new byte[temp.length + bs.length];
                System.arraycopy(temp, 0, toTemp, 0, temp.length);
                System.arraycopy(bs, 0, toTemp, temp.length, bs.length);
                temp = toTemp;
            }

        }
        if (temp.length > 0) {
            list.add(addInventory(new String(temp)));
            service.addList(list);
            System.out.println("运行时间：" + (System.currentTimeMillis() - runTime) + " 行数：" + count);
            list.clear();
        }

        threadSignal.await();
        System.out.println(System.currentTimeMillis() - startTime);
    }


    public static Inventory addInventory(String line) {
        String[] split = line.split("\\|", -1);

        Inventory inventory = new Inventory();

        inventory.setMaterial(split[0].trim());
        inventory.setMaterialdescription(split[1].trim());
        inventory.setPlnt(split[2].trim());
        inventory.setName1(split[3].trim());
        inventory.setSloc(split[4].trim());
        inventory.setMvt(split[5].trim());
        inventory.setS(split[6].trim());
        inventory.setMatdoc(split[7].trim());
        inventory.setValtype(split[8].trim());
        inventory.setIteminmatdoc(split[9].trim());
        inventory.setTime(split[10].trim());
        inventory.setPstgdate(split[11].trim());
        inventory.setQuantityinune(split[12].trim());
        inventory.setEun(split[13].trim());
        inventory.setOrder1(split[14].trim());
        inventory.setSalesord(split[15].trim());
        inventory.setAmtloccur(split[16].trim());
        inventory.setAsset(split[17].trim());
        inventory.setBun(split[18].trim());
        inventory.setBatch(split[19].trim());
        inventory.setCocd(split[20].trim());
        inventory.setCns(split[21].trim());
        inventory.setCostctr(split[22].trim());
        inventory.setCounter(split[23].trim());
        inventory.setCurr(split[24].trim());
        inventory.setCustomer(split[25].trim());
        inventory.setD_c(split[26].trim());
        inventory.setDocdate(split[27].trim());
        inventory.setEntrydate(split[28].trim());
        inventory.setExtamountlc(split[29].trim());
        inventory.setGrgislip(split[30].trim());
        inventory.setItem(split[31].trim());
        inventory.setAut(split[32].trim());
        inventory.setItm(split[33].trim());
        inventory.setMatyr(split[34].trim());
        inventory.setMvt_indicator(split[35].trim());
        inventory.setMovementtypetext(split[36].trim());
        inventory.setNetwork(split[37].trim());
        inventory.setOpac(split[38].trim());
        inventory.setOpun(split[39].trim());
        inventory.setOun(split[40].trim());
        inventory.setPo(split[41].trim());
        inventory.setQtyinorderunit(split[42].trim());
        inventory.setQtyinopun(split[43].trim());
        inventory.setQuantity(split[44].trim());
        inventory.setReas(split[45].trim());
        inventory.setRec(split[46].trim());
        inventory.setReference(split[47].trim());
        inventory.setReservno(split[48].trim());
        inventory.setRoutingno(split[49].trim());
        inventory.setSalvalincvat(split[50].trim());
        inventory.setSoitem(split[51].trim());
        inventory.setSch(split[52].trim());
        inventory.setSalesvalue(split[53].trim());
        inventory.setSno(split[54].trim());
        inventory.setTety(split[55].trim());
        inventory.setUsername(split[56].trim());
        inventory.setVendor(split[57].trim());
        inventory.setWbselement(split[58].trim());
        inventory.setDocumentheadertext(split[59].trim());
        inventory.setLast_update(new Date());

        return inventory;
    }


    public void readFileNew() throws Exception {
        //指定读取文件所在位置
        File file = new File("C:/Users/z003xp9h/Desktop/Inventory_mvt_dailydown.txt");
        FileChannel fileChannel = new RandomAccessFile(file, "r").getChannel();

        long totalSpace = file.getTotalSpace();
        System.out.println(totalSpace);

        ByteBuffer mainBuffer = ByteBuffer.allocate(100*1024*1024);

        byte[] temp = new byte[0];


        long startTime = System.currentTimeMillis();
        long runTime = System.currentTimeMillis();
        int count = 0;

        while (fileChannel.read(mainBuffer) != -1) {
            byte[] bs = new byte[mainBuffer.position()];
            int length = bs.length;

            mainBuffer.get(length);
            mainBuffer.clear();

            ByteBuffer subBuffer = ByteBuffer.allocate(200);


            int startNum = 0;
            //判断是否出现了换行符\n
            boolean isNewLine = false;
            for (int i = 0; i < bs.length; i++) {
                if (bs[i] == 10) {
                    isNewLine = true;
                    startNum = i;
                }
            }

            if (isNewLine) {
                //如果出现了换行符，将temp中的内容与换行符之前的内容拼接
                byte[] toTemp = new byte[temp.length + startNum];
                System.arraycopy(temp, 0, toTemp, 0, temp.length);
                System.arraycopy(bs, 0, toTemp, temp.length, startNum);

                count++;

                //将换行符之后的内容(去除换行符)存到temp中
                temp = new byte[bs.length - startNum - 1];
                System.arraycopy(bs, startNum + 1, temp, 0, bs.length - startNum - 1);
                //使用return即为单行读取，不打开即为全部读取
                //return;
            } else {
                //如果没出现换行符，则将内容保存到temp中
                byte[] toTemp = new byte[temp.length + bs.length];
                System.arraycopy(temp, 0, toTemp, 0, temp.length);
                System.arraycopy(bs, 0, toTemp, temp.length, bs.length);
                temp = toTemp;
            }

        }
        if (temp.length > 0) {
//            list.add(addInventory(new String(temp)));
//            service.addList(list);
//            System.out.println("运行时间：" + (System.currentTimeMillis() - runTime) + " 行数：" + count);
//            list.clear();
        }

        System.out.println(System.currentTimeMillis() - startTime);

    }


    public static void main(String[] args) throws Exception {
        InventoryReadUtil readUtil = new InventoryReadUtil();
        readUtil.readFileNew();
    }
}
