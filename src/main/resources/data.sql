insert into user_details(id, birth_date, name)
values(10001, current_date(), 'Bohdan');

insert into user_details(id, birth_date, name)
values(10002, current_date(), 'Anton');

insert into user_details(id, birth_date, name)
values(10003, current_date(), 'Anastasia');

insert into post(id, description, user_id)
values(20001, 'Test 1 of Post for User 10001', 10001);

insert into post(id, description, user_id)
values(20002, 'Test 2 of Post for User 10001', 10001);

insert into post(id, description, user_id)
values(20003, 'Test 1 of Post for User 10002', 10002);