package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/4/13 17:38
 * @describe:
 */
public class DDLtool {

   public static void tool(String sql){
       if (sql==null|| sql.equals("")){return;}
       String tableName = null;
       String prefix =null;
       String lastfix = null;
       if (sql.contains("TABLE")){
           String[] segments = sql.split("TABLE");
           prefix = segments[0]+"TABLE ";
           String[] s = segments[1].split(" ");
           tableName = s[1];
           lastfix = sql.split(tableName)[1];

           System.out.println("表名："+tableName);
           System.out.println();
       }
       StringBuilder stringBuilder = new StringBuilder();

       for (int i=0;i<100;i++){
           stringBuilder.append(prefix).append(tableName).append("_");
           String s = Integer.toHexString(i).toLowerCase();
           if (s.length()<2){
               s="0"+s;
           }
           stringBuilder.append(s).append(lastfix).append("\t\n");
       }
       System.out.println(stringBuilder);

   }

    public static void main(String[] args) {
       String sql = "ALTER TABLE business_order_extension_split ADD COLUMN agent_channel_type VARCHAR(16) COMMENT '代付通道类型';";
        tool(sql);
    }
//   "
//    ALTER TABLE business_order_extension_split ADD COLUMN agent_channel_type VARCHAR(16) COMMENT '代付通道类型';"
}
