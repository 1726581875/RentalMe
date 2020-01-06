user表:
id id自增
username 用户名字(唯一)
phone 手机号(唯一)
password 密码
money 金额
role 权限(0是普通用户, 1是管理员)
brief 简介
realName 真实姓名
idNumber 身份证号
state 用户状态(正常0,封禁1, 未还清2，未实名3)

category表:
id id自增
name 类名

item表:
id id自增
uid 用户id
cid 类别id
title 标题
contact 内容
createDate 创建时间(数据库自动生成)
basePayment 基础付款(例如3/天, 3就是这个值, 钱以分为单位)
countType 单位(例如3/天, 天就是这个值)
minTime 最小租时长(以countType单位为准)
maxTime 最长租借时长(以countType单位为准)
overTime 超时时的金额计算(以countType单位为准)
lost 丢失赔付金额(以分为单位)
state 表示物品有没有被拍下, 正常是1, 拍下是0, 订单取消就恢复为1

itemImage表:存储详情图片的id
id id自增
iid 物品id
pic 图片相对路径

review表:
id id自增
uid 被评论的用户id
fromUid 评论的用户id
submitDate 评论生成时间
content 评价内容
review (0表示差评, 1表示好评)

order表:
id id自增
ownId 借出人id
uid 借的人的id
iid 物品id
orderCode 借单号(由定长用户id+定长物品id+时间戳生成)
createDate 订单生成时间(自动生成)
loanTime 借的天数(续借/提前还 的话卖家同意就更新这里)
prePayDate 预付款时间
loanConfirmDate 借出确认时间
returnConfirmDate 归还确认时间
reCountPayTime 调整尾款时间(超时就要多付款, 没有超时就返回一些金额)
status 状态(买家未付款, 买家已取消, 卖家已取消, 卖家未借出, 买家未还, 未评价, 买家已评价, 卖家已评价, 买家未付尾款, 双方已评价)






















