import pandas as pd;
update="UPDATE `vz-it-np-gk1v-dev-cwlspr-0.vzw_cja_dev_tbls.be_upgrade_fee_equip_sum_fact_F` SET mtn='"
where="' WHERE mtn='"
sett="' and PYMNT_DT BETWEEN DATE_SUB(CURRENT_DATE()-1,INTERVAL 29 DAY)  AND DATE_ADD(CURRENT_DATE()-1,INTERVAL 1 DAY)  AND RPT_MTH=FORMAT_DATE('%G-%m-01',CURRENT_DATE()-1)   AND (LOWER(TRIM(mgd_segmt)) NOT LIKE 'cc %'   OR LOWER(TRIM(mgd_segmt)) NOT LIKE 'cn b2b%')  AND return_qty = 1"
s=""
df = pd.read_excel(r'/workspace/Codes/results.xlsx')
text_file = open("/workspace/Codes/output.txt", "w")
src=df["COMMON"]
tgt=df["STEP_G"]
k=1
for i in range(28):
    s=s+str(update)+str(src[i+k*28])+str(where)+str(tgt[i])+str(sett)+str(";")
    print(i,"---",i+k*28,end=" ")

text_file.write(s)
text_file.close()
