/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyScreenSettingRequest extends RpcAcsRequest<ModifyScreenSettingResponse> {
	
	public ModifyScreenSettingRequest() {
		super("aegis", "2016-11-11", "ModifyScreenSetting", "vipaegis");
	}

	private String screenTitle;

	private String screenIdSetting;

	public String getScreenTitle() {
		return this.screenTitle;
	}

	public void setScreenTitle(String screenTitle) {
		this.screenTitle = screenTitle;
		if(screenTitle != null){
			putQueryParameter("ScreenTitle", screenTitle);
		}
	}

	public String getScreenIdSetting() {
		return this.screenIdSetting;
	}

	public void setScreenIdSetting(String screenIdSetting) {
		this.screenIdSetting = screenIdSetting;
		if(screenIdSetting != null){
			putQueryParameter("ScreenIdSetting", screenIdSetting);
		}
	}

	@Override
	public Class<ModifyScreenSettingResponse> getResponseClass() {
		return ModifyScreenSettingResponse.class;
	}

}
