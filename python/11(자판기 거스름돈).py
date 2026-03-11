value = int(input("물건값을 입력하시오:"))
Money = int(input("1000원 지폐의 개수:")) * 1000
coin = int(input("500원 동전의 개수:")) * 500
coin2 = int(input("100원 동전의 개수:"))* 100


Money2 = Money+coin+coin2
value2 = Money2 - value

print(f"500원={value2//500}")
value2 = value2%500


print(f"100원={value2//100}")
value2 = value2%100

print(f"10원={value2//10}")
value2 = value2%10

print(f"1원={value2//1}")
      

