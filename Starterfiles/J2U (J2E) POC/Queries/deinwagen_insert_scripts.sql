

Insert into vehicle_model 
Values (1001,'Class A','psarkar', CURRENT_TIMESTAMP),
(1002, 'Class B', 'psarkar', CURRENT_TIMESTAMP),
(1003, 'Class C','psarkar', CURRENT_TIMESTAMP),
(1004, 'Class E','psarkar', CURRENT_TIMESTAMP);

Insert into vehicle_body  
Values 
(10001,'limousine', 1001, 'psarkar', CURRENT_TIMESTAMP),
(10002, 'sedan', 1004, 'psarkar', CURRENT_TIMESTAMP),
(10003, 'coupe', 1003, 'psarkar', CURRENT_TIMESTAMP),
(10004, 'cabriolet', 1003,'psarkar', CURRENT_TIMESTAMP);
(10004, 'cabriolet', 1004,'psarkar', CURRENT_TIMESTAMP);

Insert into vehicle_engine
Values
(100001,'Petrol', 1001, 7987, 'psarkar', CURRENT_TIMESTAMP),		
(100002, 'Diesel', 1001, 343, 'psarkar', CURRENT_TIMESTAMP),		
(100003, 'electric', 1002, 4535, 'psarkar', CURRENT_TIMESTAMP);	

update vehicle_engine set engine_price=783 where engine_price=0;

truncate  table vehicle_engine

select * from vehicle_paint


insert into vehicle_line
values
(1000001,'A 160 Limousine',1001,100001,24681, 'psarkar', CURRENT_TIMESTAMP),
(1000009,'B 180 d "Taxi"',1002,100002,28921, 'psarkar', CURRENT_TIMESTAMP),
(1000019,'C 200 AMG Line Cabriolet',1003,100003,37800, 'psarkar', CURRENT_TIMESTAMP),
(1000026,'E 220 d Limousine',1004,100003,43500,'psarkar', CURRENT_TIMESTAMP),
(1000027,'E 350 d 4MATIC Limousine',1004,100002,46600,'psarkar', CURRENT_TIMESTAMP);


insert into vehicle_equipment
values
(10000001,'Wheels- 17 inch split 5 spoke',1001,100001,2461, 'psarkar', CURRENT_TIMESTAMP),
(10000019,'Wheel Locks',1003,100002,150, 'psarkar', CURRENT_TIMESTAMP),
(10000029,'Garmin® MAP PILOT',1003,100003,324, 'psarkar', CURRENT_TIMESTAMP),
(10000039,'Smartphone Integration',1001,100001,540, 'psarkar', CURRENT_TIMESTAMP),
(10000018,'Panorama roof',1003,100002,1000, 'psarkar', CURRENT_TIMESTAMP),
(10000013,'LED headlamp & Taillamps',1003,100001,961, 'psarkar', CURRENT_TIMESTAMP);

insert into vehicle_paint(paint_id, paint_name,paint_type,model_id,price)
values
(20000001,'Black','Interior',1001,233),
(20000028,'Canberry Red Leather','Interior',1004,3289),
(20000016,'Polar white','Exterior',1004,222),
(20000023,'Lunar Blue','Exterior',1003,720),
(20000009,'Crystal Grey','Interior',1001,23),
(20000008,'Black','Exterior',1004,1000);
