INSERT INTO STORY (id, title, summary, modificationCounter) VALUES (1, 'Raefel Deal Controvesy', 'In September 2016, India signed an inter-governmental agreement with France, dubbed as "Rafale deal", in which India bought 36 off-the-shelf Dassault Rafale twin-engine fighters for a price estimated to be Rs. 58,000 crore or 7.8 billion Euros.', 0);
INSERT INTO STORY (id, title, summary, modificationCounter) VALUES (2, 'Cyclone Gaja To Hit Coastal Tamil Nadu Tonight', 'The weather office has said that low-lying areas of Nagapattinam, Thanjavur, Pudukkottai and Ramanathapuram districts are likely to be inundated when cyclone Gaja hits the coast.', 0);

INSERT INTO EVENT (id, content, modificationCounter) VALUES(1, 'Hollande was quoted in an article by a French website ‘Mediapart’ claiming that the Indian government had asked the French government to nominate Reliance Defence as its India partner in the deal. “We did not have a say in this,” Hollande was quoted as saying. “The Indian government proposed this service group and Dassault negotiated with Ambani.  We did not have a choice, we took the interlocutor who was given to us.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(2, 'When Francois Hollande was the President of France, the deal to purchase 36 Rafale fighter jets from France was announced by Prime Minister Narendra Modi in 2015. The deal was signed in 2016.  The UPA government was earlier negotiating a deal to procure 126 Rafale jets, with 18 to come in flyaway condition and 108 to be manufactured by HAL under licence', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(3, 'As per the 2015 deal signed by Indian PM Narendra Modi and then French President Francoise Hollande, the number of Rafale aircraft were reduced from 126 to 26. Furthermore, the manufacture of the aircraft would be completed in France and the "offsets clause" of the deal states that France would invest 50% of the cost of the total order in Indian companies. Out of around 75 listed firms, the makers of Rafale, Dassault Aviation, was allowed to choose any company it wants, the deal stated.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(4, 'The opposition in India has been alleging that Anil Ambani firm Reliance Defence was favoured in the offsets contract at the cost of state-owned Hindustan Aeronautics Ltd (HAL) despite the private firm having no prior experience in aerospace manufacturing.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(5, 'In response to Hollande claim, the French government issued a statement, which said: “The French government is in no manner involved in the choice of Indian industrial partners who have been, are being or will be selected by French companies.”', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(6, 'The statement added: "In accordance with India acquisition procedure, French companies have the full freedom to choose their Indian partner companies that they consider to be the most relevant, then present for the Indian government approval the offset projects that they wish to execute in India with these local partners so as to fulfil their obligations in this regard."', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(7, 'Dassault Aviation, the makers of the Rafale jets, also issued a statement on Friday night, saying: "This offsets contract is delivered in compliance with the Defence Procurement Procedure (DPP) 2016 regulations. In this framework, and in accordance with the policy of Make in India, Dassault Aviation has decided to make a partnership with India Reliance Group. This is Dassault Aviation choice."', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(8, 'Hollande statement has triggered an attack from the Indian National Congress against the Modi government. Party chief Rahul Gandhi took to Twitter to state that the Rafale deal was doctored "behind closed doors" by PM Modi. "The Prime Minister personally negotiated and changed the Rafale deal behind closed doors. Thanks to François Hollande, we now know he personally delivered a deal worth billions of dollars to a bankrupt," he tweeted.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(9, 'The Defence Ministry, however, continues to maintain that neither the government of India nor the French government had any say in the commercial decision. The Centre has repeatedly stated it was Dassault that chose its India partner for offsets and that the government had no say in the deal.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(10, 'Following Hollande’s statement, the Defence Ministry also tweeted to say, “The report referring to fmr French president Mr. Hollande statement that GOI insisted upon a particular firm as offset partner for the Dassault Aviation in Rafale is being verified. It is reiterated that neither GoI nor French Govt had any say in the commercial decision.”', 0);

INSERT INTO EVENT (id, content, modificationCounter) VALUES(11, 'The weather office said Gaja will intensify into a "Severe Cyclonic Storm" today before it weakens and hits the coast between Pamban and Cuddalore.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(12, 'Ten teams of the National Disaster Response Force (NDRF)  are on stand-by and 6,000 relief centres have been set up across Tamil Nadu. NDRF teams have been put on alert in Puducherry, Kerala and Andaman and Nicobar too.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(13, 'As of last night, Gaja was 480 km away Nagapattinam and 410 km away from Chennai.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(14, 'The Met department said it would intensify this afternoon and weaken before making a landfall.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(15, '30,500 rescue personnel were on stand-by, the Tamil Nadu government said.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(16, 'Tamil Nadu Revenue Minister RB Udayakumar said that dams, lakes and river channels were being monitored continuously.', 0);
INSERT INTO EVENT (id, content, modificationCounter) VALUES(17, 'The weather office has said that low-lying areas of Nagapattinam, Thanjavur, Pudukkottai and Ramanathapuram districts are likely to be inundated when Cyclone Gaja hits the coast.', 0);

INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 1);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 2);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 3);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 4);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 5);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 6);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 7);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 8);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 9);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(1, 10);

INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 11);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 12);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 13);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 14);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 15);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 16);
INSERT INTO STORY_EVENT(story_id, event_id) VALUES(2, 17);