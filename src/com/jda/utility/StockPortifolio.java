package com.jda.utility;

import org.json.simple.JSONObject;

public class StockPortifolio {
	private String name;
	private long noOfShare;
	private long sharePrice;
	public StockPortifolio(JSONObject jsonobject) {
		name = (String) jsonobject.get("stockNames");
	    noOfShare= (long) jsonobject.get("quantity");
	    sharePrice = (long) jsonobject.get("sharePrice");
	}
		public StockPortifolio(String name, long noofshare, long shareprice) {
			this.noOfShare = noofshare;
			this.sharePrice = shareprice;
			this.name = name;
		}

		public long getnoofshare() {
			return noOfShare;
		}

		public String getname() {

			return name;
		}

		public long getshareprice() {
			return sharePrice;
		}

		public void setnoofshare(long noOfShare) {
			this.noOfShare = noOfShare;
		}

		public void setshareprice(long sharePrice) {
			this.sharePrice= sharePrice;
		}

		public void setname(String name) {
			this.name = name;
		}

		public long value() {
			return noOfShare*sharePrice;
		}

		@Override
		public String toString() {
			return "{" + "\"name\":\"" + name + ",\"" + "\"noofshare\":\"" + noOfShare + ",\"shareprice\":\"" + sharePrice + "}";

		}
}
