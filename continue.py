import csv
f = open('seoul.csv')
data = csv.reader(f)
header = next(data)
max_temp = -999
max_date = '0-0-0'
for row in data:
    if row[-1] =='':
        continue
    row[-1] = float(row[-1])
    if max_temp < row[-1]:
            max_date, max_temp = row[0], row[-1]
f.close()
mYear, mMon, mDay = max_date.split('-')
print("기상 관측 이래 서울의 최고 기온이 가장 높았던 날은 {}년 {}월 {}일로 {}도 였습니다".
      format(mYear,mMon,mDay,max_temp))
